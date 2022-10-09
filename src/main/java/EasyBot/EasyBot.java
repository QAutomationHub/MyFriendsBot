package EasyBot;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import java.util.*;

import static EasyBot.AnswerMessagesGenerator.AnecdoteMsg.answerAnecdote;
import static EasyBot.AnswerMessagesGenerator.BotMsg.getAnswerBot;
import static EasyBot.AnswerMessagesGenerator.FridayOfferMsg.getFridayOfferImage;
import static EasyBot.AnswerMessagesGenerator.FriendsPhotoMsg.*;
import static EasyBot.AnswerMessagesGenerator.GoodMorningMsg.getRandomGoodMorningImage;
import static EasyBot.AnswerMessagesGenerator.GoodNightMsg.getGoodNight;
import static EasyBot.AnswerMessagesGenerator.SwearWordsMsg.answerSwearWords;
import static EasyBot.AnswerMessagesGenerator.SwearWordsMsg.refactorSwearWords;
import static EasyBot.AnswerMessagesGenerator.WeekDayMessages.getWeekdayMsg;
import static EasyBot.AnswerMessagesGenerator.WetherMessages.Weather.getWeatherMsg;
import static EasyBot.AnswerMessagesGenerator.WordGeneratorMsg.*;


@Service
@SpringBootApplication
@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduling.enabled", matchIfMissing = true)
public class EasyBot extends TelegramLongPollingBot {



    @SneakyThrows
    public static void main(String[] args) {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
        EasyBot bot = new EasyBot();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(bot);
        SpringApplication.run(EasyBot.class, args);

    }


    @Override
    public String getBotUsername() {
        return System.getProperty("bot.username");
    }


    @Override
    public String getBotToken() {
        return System.getProperty("bot.token");
    }


    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {


        if (update.hasCallbackQuery()) {
            handleCallback(update.getCallbackQuery());
        }

        // ? Сообщения отправляемые в определенное время
        if (!update.hasMessage() && !update.getMessage().hasText()) {
            sendPlannedGoodMorningMsg();
            sendPlannedWeatherMsg();
            sendGoodNightMsg();
            sendMeetingFridayMsg();
        }

        // ? Сообщения отправляемые по событию
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message message = getMsg(update);
            String chatId = getChatId(message);
            String userId = getUserId(message);
            String answer = getAnswerController(message);
            sendMsg(chatId, answer);
        }

    }

    @SneakyThrows
    private String getAnswerController(Message message) {

        String mes = message.getText().trim();
        String userName = message.getFrom().getFirstName();
        String answer = null;
        if (refactorSwearWords(mes)) {
            answer = answerSwearWords(userName);
        } else if (mes.toLowerCase().contains("бот")) {
            answer = getAnswerBot(userName);
        } else if (mes.toLowerCase().contains("анекдо")) {
            answer = answerAnecdote();
        } else if (mes.toLowerCase().contains("погода")) {
            answer = getWeatherMsg();
        } else if (mes.toLowerCase().contains("тест")) {
            answer = "\uD83E\uDD70" + "\uD83E\uDD76" + "\uD83E\uDD76" + "\uD83E\uDD7A";
        } else if (mes.toLowerCase().contains("хах")) {
            answer = "\uD83E\uDD23";
        } else if (mes.toLowerCase().contains("/random_friend")) {
            getPresentButtonFriends(message);
        } else if (mes.toLowerCase().contains("/random_word")) {
            getPresentButtonWord(message);
        } else {
            answer = "";
        }
        return answer;
    }


    // ? Печатаем в консоль информацию о сообщении
    private Message getMsg(Update update) {
        Message message = update.getMessage();
        String userId = message.getFrom().getId().toString();
        String chatId = message.getChatId().toString();
        String userName = message.getFrom().getFirstName();
        System.out.println("Сообщение от пользователя [" + userName + "]: " + message.getText() + " с user_id: [" + userId + "] с chat_id: [" + chatId + "]");
        return update.getMessage();
    }


    private String getChatId(Message message) {
        return message.getChatId().toString();
    }

    private String getUserId(Message message) {
        return message.getFrom().getId().toString();
    }

    // ? Отправляем сообщение в чат
    private void sendMsg(String chatId, String answer) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(answer);
        try {
            if (!answer.equals("")) {
                execute(sendMessage);
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    // ! Запланированные сообщения
    // ? С добрым утром 8:00
    @Scheduled(cron = "0 00 08 * * *")
    public void sendPlannedGoodMorningMsg() {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId("-627868294");
        sendPhoto.setCaption(getWeekdayMsg());
        sendPhoto.setPhoto(new InputFile(getRandomGoodMorningImage()));
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    // ? Погода 8:30
    @Scheduled(cron = "0 30 08 * * *")
    public void sendPlannedWeatherMsg() {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId("-627868294");
        sendMessage.setText(getWeatherMsg());
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    // ? Спокойной ночи 23:00
    @Scheduled(cron = "0 00 23 * * *")
    public void sendGoodNightMsg() {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId("-627868294");
        sendPhoto.setCaption("Доброй ночи ! \uD83D\uDE34");
        sendPhoto.setPhoto(new InputFile(getGoodNight()));
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    // ? Пятница 15:00
    @Scheduled(cron = "0 30 15 * * 5")
    public void sendMeetingFridayMsg() {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId("-627868294");
        sendPhoto.setCaption("\uD83D\uDD0A Какие планы на выходные⁉\n" +
                "\uD83D\uDC49Может встретимся⁉" +
                "\uD83D\uDC7B\uD83C\uDF7A\uD83C\uDF7A\uD83C\uDF7A\uD83D\uDC40");
        sendPhoto.setPhoto(new InputFile(getFridayOfferImage()));
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    // ? ---------------------------------------------------------------------------


    public static String randomValueList(List<String> list) {
        int i = new Random().nextInt(list.size());
        return list.get(i);
    }


    private void getPresentButtonFriends(Message message) throws TelegramApiException {

        Optional<MessageEntity> commandEntity =
                message.getEntities().stream().filter(e -> "bot_command".equals(e.getType())).findFirst();

        if (commandEntity.isPresent()) {

            String command = message.getText().substring(commandEntity.get().getOffset(), commandEntity.get().getLength());

            switch (command) {
                case "/random_friend@Alexandr1987bot":

                    List<List<InlineKeyboardButton>> buttons1 = new ArrayList<>();
                    buttons1.add(
                            Arrays.asList(
                                    getInlineKeyboardButton(
                                            "Boy \uD83D\uDC81\u200D♂️",
                                            "random.boyfriend"),
                                    getInlineKeyboardButton(
                                            "Girl \uD83D\uDC81\u200D♀️",
                                            "random.girlfriend"),
                                    getInlineKeyboardButton(
                                            "All \uD83D\uDC6D",
                                            "random.allFriend")));
                    execute(getSendMessageBuilder(message, buttons1, "Сгенерировать случайного друга \uD83D\uDC47"));
                    return;
            }
        }
    }


    private void getPresentButtonWord(Message message) throws TelegramApiException {

        Optional<MessageEntity> commandEntity =
                message.getEntities().stream().filter(e -> "bot_command".equals(e.getType())).findFirst();

        if (commandEntity.isPresent()) {

            String command = message.getText().substring(commandEntity.get().getOffset(), commandEntity.get().getLength());

            switch (command) {
                case "/random_word@Alexandr1987bot":
                    List<List<InlineKeyboardButton>> buttons1 = new ArrayList<>();
                    buttons1.add(
                            Arrays.asList(
                                    getInlineKeyboardButton(
                                            "Простое \uD83E\uDD49",
                                            "random.easy.word"),
                                    getInlineKeyboardButton(
                                            "Среднее \uD83E\uDD48",
                                            "random.medium.word"),
                                    getInlineKeyboardButton(
                                            "Сложное \uD83C\uDF96",
                                            "random.hard.word")
                            ));
                    execute(getSendMessageBuilder(message, buttons1, "Сгенерировать случайное слово \uD83C\uDFB2"));
                    return;
            }
        }
    }


    @SneakyThrows
    private void handleCallback(CallbackQuery callbackQuery) {

        Message message = callbackQuery.getMessage();

        switch (callbackQuery.getData()) {

            case "random.boyfriend":
                execute(SendPhoto.builder()
                        .chatId(message.getChatId().toString())
                        .photo(new InputFile(randomValueList(getFriendBoy())))
                        .caption("\uD83D\uDC46")
                        .build());
                return;

            case "random.girlfriend":
                execute(SendPhoto.builder()
                        .chatId(message.getChatId().toString())
                        .photo(new InputFile(randomValueList(getFriendGirl())))
                        .caption("\uD83D\uDC46")
                        .build());
                return;

            case "random.allFriend":
                execute(SendPhoto.builder()
                        .chatId(message.getChatId().toString())
                        .photo(new InputFile(randomValueList(getAllFriends())))
                        .caption("\uD83D\uDC46")
                        .build());
                return;

            case "random.easy.word":
                execute(SendMessage.builder()
                        .chatId(message.getChatId().toString())
                        .text(getEasyRandomWord())
                        .build());
                return;

            case "random.medium.word":
                execute(SendMessage.builder()
                        .chatId(message.getChatId().toString())
                        .text(getMediumRandomWord())
                        .build());
                return;

            case "random.hard.word":
                execute(SendMessage.builder()
                        .chatId(message.getChatId().toString())
                        .text(getHardRandomWord())
                        .build());
                return;
        }
    }


    private InlineKeyboardButton getInlineKeyboardButton(String nameButton, String callbackData) {
        return InlineKeyboardButton.builder()
                .text(nameButton)
                .callbackData(callbackData)
                .build();
    }

    private SendMessage getSendMessageBuilder(Message message, List<List<InlineKeyboardButton>> list, String
            text) {
        return SendMessage.builder()
                .text(text)
                .chatId(message.getChatId().toString())
                .replyMarkup(InlineKeyboardMarkup.builder().keyboard(list).build())
                .build();
    }

}
