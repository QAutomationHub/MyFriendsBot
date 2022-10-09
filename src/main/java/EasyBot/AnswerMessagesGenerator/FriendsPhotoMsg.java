package EasyBot.AnswerMessagesGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FriendsPhotoMsg {

    public static List<String> getFriendBoy() {
        List<String> result = new ArrayList<>();
        String[] friendBoy = {"Горбунов", "Григорьев", "Стрелинов", "Усен"};
        String randomFriendBoy = selectRandomStringInArray(friendBoy);
        switch (randomFriendBoy) {
            case "Горбунов":
                result.add("https://disk.yandex.ru/i/OgTrc4WkHVFDMQ");
                result.add("https://disk.yandex.ru/i/NkgRWDEMVXMAEg");
                result.add("https://disk.yandex.ru/i/ew__O4tUqyv5QA");
                result.add("https://disk.yandex.ru/i/dC6ophDPEtP3tQ");
                break;
            case "Григорьев":
                result.add("https://disk.yandex.ru/i/xY0taeUMIirqTA");
                result.add("https://disk.yandex.ru/i/Q4upnhVwhTbqPQ");
                result.add("https://disk.yandex.ru/i/jeZAh9cPLSJaUw");
                result.add("https://disk.yandex.ru/i/HwzJ3ndn2l5IVw");
                break;
            case "Стрелинов":
                result.add("https://disk.yandex.ru/i/E0VgmnqW5_27iA");
                result.add("https://disk.yandex.ru/i/tFvKtrWV2XTpOw");
                result.add("https://disk.yandex.ru/i/l0FGFAWEjlFOEw");
                result.add("https://disk.yandex.ru/i/azksahB_W9doOA");
                break;
            case "Усен":
                result.add("https://disk.yandex.ru/i/elwZINGz19pkRg");
                result.add("https://disk.yandex.ru/i/kQbTo4IxOMeZ2g");
                result.add("https://disk.yandex.ru/i/DEUbgqe9i9sKJg");
                result.add("https://disk.yandex.ru/i/B2Voz2n2Wd_T5A");
                break;
        }
        return result;
    }

    public static List<String> getFriendGirl() {
        List<String> result = new ArrayList<>();
        String[] friendBoy = {"Горбунова", "Григорьева", "Костина", "Серебрякова"};
        String randomFriendBoy = selectRandomStringInArray(friendBoy);
        switch (randomFriendBoy) {
            case "Горбунова":
                result.add("https://disk.yandex.ru/i/N6O-MqlTelUHUg");
                result.add("https://disk.yandex.ru/i/kOXgb9460qu0nA");
                result.add("https://disk.yandex.ru/i/NPLiwAz1ED9aVw");
                result.add("https://disk.yandex.ru/i/jeHHbAHoemBGmg");
                break;
            case "Григорьева":
                result.add("https://disk.yandex.ru/i/6r8pQ4Rxrox-Dg");
                result.add("https://disk.yandex.ru/i/3mI_MJ1YR7GPZw");
                result.add("https://disk.yandex.ru/i/3xnbopu5tMreXQ");
                result.add("https://disk.yandex.ru/i/5qKFfJL4eSMNRw");
                break;
            case "Костина":
                result.add("https://disk.yandex.ru/i/voTeLZGTf5grAA");
                result.add("https://disk.yandex.ru/i/jbhqHPaiq9gz_Q");
                result.add("https://disk.yandex.ru/i/DFCrjlVvIzvCVg");
                result.add("https://disk.yandex.ru/i/jOBl_OT_6beEuQ");
                break;
            case "Серебрякова":
                result.add("https://disk.yandex.ru/i/soRqG7uAYehwVg");
                result.add("https://disk.yandex.ru/i/iCh8WZeh6PYHQQ");
                result.add("https://disk.yandex.ru/i/2S8urMgQNlS4Fw");
                result.add("https://disk.yandex.ru/i/BuVAzBH-u1V7Bw");
                break;
        }
        return result;
    }
    public static List<String> getAllFriends() {
        List<String> friendsBoy = getFriendBoy();
        List<String> friendsGirl = getFriendGirl();
        List<String> result = new ArrayList<>();
        result.addAll(friendsBoy);
        result.addAll(friendsGirl);
        return result;
    }


    public static String selectRandomStringInArray(String[] array) {
        if (array != null && array.length > 0) {
            Random r = new Random();
            return array[r.nextInt(array.length)];
        }
        return null;
    }
}
