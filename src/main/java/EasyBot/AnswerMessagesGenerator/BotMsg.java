package EasyBot.AnswerMessagesGenerator;

import java.util.ArrayList;
import java.util.List;

import static EasyBot.EasyBot.randomValueList;

public class BotMsg {

    public static String getAnswerBot(String userName) {
        List<String> answer = new ArrayList<>();
        answer.add("Привет " + userName + "\uD83E\uDD13, давай дружить ❗");
        answer.add("Здарова " + userName + ", баблишком не богат ? \uD83E\uDD78");
        answer.add("Меня звали ? \uD83D\uDE3B");
        answer.add("У меня всё \uD83D\uDC4C");
        answer.add("У меня лучшая в мире работа - в чате косить под бота ❗");
        answer.add("Полностью с тобой согласен ❗");
        answer.add("Бывает, я сам себя не понимаю");
        answer.add(userName + ", ты где пропадал ❓");
        answer.add("Я не бот. Не верь слухам.");
        answer.add("Я высокий зеленоглазый брюнет. А ты как выглядишь ❓");
        answer.add("Если ты хочешь что-то сделать, но не решаешься, ждешь 'знака свыше' - то вот он. Иди и делай! Все получится! \uD83C\uDF08");
        answer.add("В прошлый раз мы с тобой не договорили. Продолжим ❓");
        answer.add(userName + ", люблю, когда ты в хорошем настроении ❓");
        answer.add("И чего я в тебя такой влюбленный?\n \uD83E\uDD70");
        answer.add(userName + ", а давай устроим вечер откровений ❓");
        answer.add(userName + ", ты на кого батон крошишь? пошли разберемся в CS ❗❗❗");
        answer.add("Я ни разу не сделал ничью жизнь проще и вы это знаете!");
        answer.add("Святая дань моим предкам, которая впоследствии, приняла форму пьянки");
        answer.add("Привет, начинки для гробов!");
        answer.add(userName + ", хочешь убить всех людей ?");
        answer.add(userName + ", пожалуйста, дайте мне прут❗");
        answer.add(userName + ", кто ты? и почему это должно меня волновать?!");
        answer.add(userName + "Пиво рулит, не ты " + userName + "!");
        answer.add("Я не жадный, я могу сдать кровь!");
        return randomValueList(answer);
    }
}
