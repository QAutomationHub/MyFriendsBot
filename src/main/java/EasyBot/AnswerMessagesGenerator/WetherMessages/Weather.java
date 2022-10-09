package EasyBot.AnswerMessagesGenerator.WetherMessages;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;


import java.text.SimpleDateFormat;
import java.util.Date;

import static io.restassured.RestAssured.given;


public class Weather {

    // ? cron = "0 30 16 * * *"
    public static String getWeatherMsg() {

        Model model = new Model();

        Response response = given()
                .contentType(ContentType.JSON)
                .param("q", "санкт петербург")
                .param("appid", "1cfaab0349db6e57bddf0773bd304d7f")
                .param("units", "metric")
                .when()
//                .log().all()
                .get("http://api.openweathermap.org/data/2.5/weather")
                .then()
//                .log().all()
                .extract()
                .response();


        JSONObject object = new JSONObject(response.asString());

        model.setName(object.getString("name"));
        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getDouble("temp"));
        model.setHumidity(main.getDouble("humidity"));

        JSONArray getArray = object.getJSONArray("weather");
        for (int i = 0; i < getArray.length(); i++) {
            JSONObject obj = getArray.getJSONObject(i);
            model.setMain((String) obj.get("main"));
        }


        String date = getSimpleDateFormat("E dd.MM.yyyy '⏰' HH:mm");


        String result = "\uD83D\uDCCC Сегодня: " + date + "\n" +
                "Температура воздуха: " + getTempSmile(model.getTemp()) + "\n" +
                "В городе на неве сегодня " + getMainAnswer(model.getMain()) + "\n" +
                "Влажность: " + model.getHumidity() + " % хотя кому она нахрен нужна \uD83D\uDE01";

        System.out.println(result);
        return result;
    }


    private static String getSimpleDateFormat(String pattern) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat(pattern);
        return formatForDateNow.format(dateNow);
    }

    private static String getMainAnswer(String main) {
        String result = null;
        if (main.toLowerCase().contains("rain")) {
            result = "дождь \uD83C\uDF27 \nНе забудьте взять с собой зонт ☔";
        } else if (main.toLowerCase().contains("wind")) {
            result = "\uD83C\uDF2A";
        } else if (main.toLowerCase().contains("clouds")) {
            result = "пасмурно ☁\nЭто Питер детка❗";
        } else if (main.toLowerCase().contains("snow")) {
            result = "снег ❄ Слепим ☃❓";
        } else if (main.toLowerCase().contains("clear")) {
            result = "ясно ☀\nЭто один из немногих дней когда Питер радует нас ясной погодой! Ловите момент!\uD83D\uDE0E";
        } else {
            result = "⛔ нет информации ❗";
        }
        return result;
    }

    private static String getTempSmile(double temp) {
        String result = null;
        int intTemp = (int) temp;
        if (intTemp >= 25) {
            result = intTemp + " °С Жарко! Одевайтель легче! \uD83E\uDD75";
        } else if (intTemp < 25 && intTemp > 0) {
            result = intTemp + " °С";
        } else if (intTemp <= 0) {
            result = intTemp + " °С Холодно! Одевайтесь теплее! \uD83E\uDD76";
        }
        return result;
    }
}