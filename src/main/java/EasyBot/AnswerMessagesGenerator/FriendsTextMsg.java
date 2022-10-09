package EasyBot.AnswerMessagesGenerator;

import java.util.ArrayList;
import java.util.List;

import static EasyBot.EasyBot.randomValueList;

public class FriendsTextMsg {

    public static String getFriendBoyText() {
        List<String> answer = new ArrayList<>();
        answer.add("Лёха Горбунов!");
        answer.add("Саня Стрелинов!");
        answer.add("Олег Григорьев!");
        answer.add("Лёха Усен!");
        return "\uD83D\uDC49 " + randomValueList(answer);
    }

    public static String getFriendGirlText() {
        List<String> answer = new ArrayList<>();
        answer.add("Вика Костина!");
        answer.add("Таня Григорьева!");
        answer.add("Оля Горбунова!");
        answer.add("Юля Серебрякова!");
        return "\uD83D\uDC49 " + randomValueList(answer);
    }

    public static String getAllFriendsText() {
        List<String> answer = new ArrayList<>();
        answer.add("Лёха Горбунов!");
        answer.add("Саня Стрелинов!");
        answer.add("Олег Григорьев!");
        answer.add("Лёха Усен!");
        answer.add("Вика Костина!");
        answer.add("Таня Григорьева!");
        answer.add("Оля Горбунова!");
        answer.add("Юля Серебрякова!");
        return "\uD83D\uDC49 " + randomValueList(answer);
    }
}
