package EasyBot.AnswerMessagesGenerator;

import static EasyBot.AnswerMessagesGenerator.FriendsPhotoMsg.selectRandomStringInArray;

public class FridayOfferMsg {

    public static String getFridayOfferImage() {

        String[] goodNightArray = {
                "https://disk.yandex.ru/i/A6U8_AmKjvJKxw",
                "https://disk.yandex.ru/i/CDhEWnmK_mpW9A",
                "https://disk.yandex.ru/i/jA4bSyIG96KLGQ",
                "https://disk.yandex.ru/i/VXIsDUeo1y9pxQ",
                "https://disk.yandex.ru/i/8g-rS3ek5FuRBg",
                "https://disk.yandex.ru/i/qrX1N-xKiuo2lw",
                "https://disk.yandex.ru/i/YxG6-WryNlFkqw",
                "https://disk.yandex.ru/i/DtT7KC04FKuWuw",
                "https://disk.yandex.ru/i/IE8qfhiGTIAo5g",
                "https://disk.yandex.ru/i/tJdgIhKxCSN4xg",
                "https://disk.yandex.ru/i/aJtMp2XFPLcQog",
                "https://disk.yandex.ru/i/ixap04L0Y5vaIw",
                "https://disk.yandex.ru/i/GMl0mJfbH2jBdg"
        };
        return selectRandomStringInArray(goodNightArray);
    }

}
