package EasyBot.AnswerMessagesGenerator;



import static EasyBot.AnswerMessagesGenerator.FriendsPhotoMsg.selectRandomStringInArray;

public class GoodNightMsg {

    public static String getGoodNight() {

        String[] goodNightArray = {
                "https://disk.yandex.ru/i/9jMwfub3k8L01g",
                "https://disk.yandex.ru/i/Y3-1Oq3P4V6xfQ",
                "https://disk.yandex.ru/i/jaTbYUss4tHEUg",
                "https://disk.yandex.ru/i/b6EGw5WNyakr3A",
                "https://disk.yandex.ru/i/C-ulda6xGd7UtA",
                "https://disk.yandex.ru/i/t9EfSqRvsNtZhQ",
                "https://disk.yandex.ru/i/ylj4_Ns586-M2g",
                "https://disk.yandex.ru/i/3OHTvXsDtQz_4g",
                "https://disk.yandex.ru/i/qHQ3Ja4CdptuoA",
                "https://disk.yandex.ru/i/8RObo1m0b9edLA",
                "https://disk.yandex.ru/i/eMvSW-PiVEuTxg",
                "https://disk.yandex.ru/i/xrKrUIAZ-qursQ",
                "https://disk.yandex.ru/i/G3XIhHskHkmF2g",
                "https://disk.yandex.ru/i/gLl_VQoBHmrfSQ",
        };
        return selectRandomStringInArray(goodNightArray);
    }


}
