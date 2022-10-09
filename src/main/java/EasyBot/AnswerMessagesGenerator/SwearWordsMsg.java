package EasyBot.AnswerMessagesGenerator;


import java.util.ArrayList;
import java.util.List;

import static EasyBot.EasyBot.randomValueList;

public class SwearWordsMsg {


    public static String answerSwearWords(String userName) {
        List<String> answer = new ArrayList<>();
        answer.add(userName + ", ругаться нехорошо, не далайте так больше \uD83E\uDD2C");
        answer.add(userName + ", не материтесь, не будьте \uD83D\uDCA9");
        answer.add(userName + ", у тебя чё, рот помойка ? \uD83E\uDEE6 \uD83D\uDCA9");
        answer.add(userName + ", меня сейчас вырвет \uD83E\uDD2E");
        answer.add(userName + ", ухи \uD83D\uDC42 вянут !");
        answer.add(userName + "⛔ ХАМ !!!");
        answer.add(userName + ", сам такой ! \uD83E\uDD23");
        answer.add(userName + ", помой рот! да с мылом! \uD83E\uDEE6");
        answer.add(userName + ", откуда вообще в нашем языке появился мат ?!\n" +
                "С научной точки зрения, использование матов – это деградация.\n" +
                "То есть вместо того, чтобы развивать свой словарный запас, а значит и мировозрение,\n" +
                "человек сознательно ленится, деградирует, так как вместо поиска и обогащения предпочитает\n" +
                "использовать несколько матерных слов \uD83E\uDD13");
        answer.add(userName + "\uD83E\uDD10");
        return randomValueList(answer);
    }

    public static boolean refactorSwearWords(String mes) {
        boolean result = false;
        boolean b1 = mes.toLowerCase().contains("жопа");
        boolean b2 = mes.toLowerCase().contains("сука");
        boolean b3 = mes.toLowerCase().contains("пизд");
        boolean b4 = mes.toLowerCase().contains("хуй");
        boolean b5 = mes.toLowerCase().contains("бля");
        boolean b6 = mes.toLowerCase().contains("хуеть");
        boolean b7 = mes.toLowerCase().contains("ебать");
        boolean b8 = mes.toLowerCase().contains("заеб");
        boolean b9 = mes.toLowerCase().contains("наеб");
        boolean b10 = mes.toLowerCase().contains("мудак");
        boolean b11 = mes.toLowerCase().contains("пидор");
        boolean b12 = mes.toLowerCase().contains("пидр");
        boolean b13 = mes.toLowerCase().contains("збс");
        boolean b14 = mes.toLowerCase().contains("гондо");
        boolean b15 = mes.toLowerCase().contains("мраз");
        boolean b16 = mes.toLowerCase().contains("идиот");
        boolean b17 = mes.toLowerCase().contains("тварь");
        boolean b18 = mes.toLowerCase().contains("лох");
        boolean b19 = mes.toLowerCase().contains("хуе");
        if (b1||b2||b3||b4||b5||b6||b7||b8||b9||b10||b11||b12||b13||b14||b15||b16||b17||b18||b19) {
            result = true;
        }
        return result;
    }

}
