package EasyBot.AnswerMessagesGenerator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static EasyBot.EasyBot.randomValueList;

public class WeekDayMessages {


    public static String getWeekdayMsg() {

        String result = null;
        String weekday = getSimpleDateFormat("E");
        if (weekday.equals("Пт")) {
            result = "Наконец-то ПЯТНИЦА ‼ \uD83E\uDD73\uD83E\uDD73\uD83E\uDD73\n" +
                    "Мы так долго её ждали \uD83D\uDD25\n" +
                    getFriday();

        } else if (weekday.equals("Сб")) {
            result = getSaturday();
        } else if (weekday.equals("Вс")) {
            result = getSunday();
        } else if (weekday.equals("Пн")) {
            result = getMonday();
        } else if (weekday.equals("Вт")) {
            result = getTuesday();
        } else if (weekday.equals("Ср")) {
            result = getWednesday();
        } else if (weekday.equals("Чт")) {
            result = getThursday();

        } else {
            result = "";
        }

        return result;
    }

    private static String getSunday() {
        List<String> list = new ArrayList<>();
        list.add("Птицы весело поют — воскресенье!\n" +
                "Чашка кофе и уют – наслажденье!\n" +
                "Никуда бежать не надо – с пробуждением!\n" +
                "Выходной с утра у всех – утешение!\n" +
                "Воскресенье пусть пройдёт радостно, несложно,\n" +
                "Чтобы вновь набраться сил свежих было можно!\n" +
                "Отдыхай же с лёгким ты настроеньем!\n" +
                "Песни пой и веселись в воскресенье!");
        list.add("Желаю супернастроенья,\n" +
                "Тепла, уюта, красоты.\n" +
                "Пускай же в это воскресенье\n" +
                "Осуществятся все мечты!\n" +
                "Пускай растают все печали,\n" +
                "Как колокольчик, смех звенит,\n" +
                "Чтоб глазки счастьем заблистали.\n" +
                "Пускай Господь от бед хранит!");
        list.add("В воскресение отдыхай,\n" +
                "Родных своих не забывай,\n" +
                "Богу утром помолись,\n" +
                "Счастьем, светом насладись.\n" +
                "На хорошее настройся,\n" +
                "О здоровье беспокойся,\n" +
                "Все, что в планах, исполняй,\n" +
                "С наслаждением погуляй.\n" +
                "В этот день собой займись,\n" +
                "От забот освободись,\n" +
                "Сил на завтра подкопи —\n" +
                "Ну, а ночью крепко спи !");
        list.add("Поздравляю с воскресеньем,\n" +
                "С долгожданным выходным!\n" +
                "Пусть же ваше настроенье\n" +
                "Будет ярким, озорным!\n" +
                "\n" +
                "Будет пусть вокруг красивым\n" +
                "Всё, сверкающим у вас!\n" +
                "Напитайтесь позитивом,\n" +
                "Чтоб всё было высший класс!\n" +
                "\n" +
                "Заряжайтесь, отдыхайте,\n" +
                "Позабудьте обо всём,\n" +
                "Непременно улыбайтесь\n" +
                "И впустите счастье в дом!");
        return randomValueList(list);
    }

    private static String getFriday() {
        List<String> list = new ArrayList<>();
        list.add("Поздравляю с пятницей и желаю великолепных выходных. Пусть сегодня будет минимум усталости и максимум удовольствия. Пусть удастся закончить все дела и насладиться пятничным вечером. Пусть впереди ждут хорошие выходные. И неважно, будут они ленивыми или насыщенными, я желаю, чтобы твоя голова отдохнула от проблем, а сердце наполнилось вдохновением \uD83C\uDF7A");
        list.add("Хорошо проведенная пятница закладывает фундамент для чудесных выходных! Пусть с пятницы начнется вереница приятных событий, встреч и звонков. Пусть все выходные тебя не покидают приподнятое настроение и вдохновение, желание что-то делать и получать результаты. А после хорошей работы не забудь отлично отдохнуть! \uD83C\uDF7A");
        list.add("Поздравляю с достойным завершением рабочей недели, пусть пятница станет точкой отсчета ярких, беззаботных, счастливых, уютных выходных \uD83C\uDF7A");
        list.add("Вот и пятница, впереди выходные. Желаю отлично провести время, зарядиться положительной энергией и ощутить прилив сил. Пусть счастливые минуты продлятся как можно дольше! \uD83C\uDF7A");
        list.add("Желаю настроения, до небес, отличного, желаю под конец рабочей недели заслуженно расслабиться и отдохнуть. Пусть пятница принесет множество положительных эмоций, а выходные тянутся и не заканчиваются. Поздравляю с пятницей! \uD83C\uDF7A");
        list.add("Ликует сердце и поёт душа. Наконец-то пятница! Поздравляю с этой приятной новостью и желаю тебе чудесных выходных. Желаю успеть абсолютно всё: и хорошенько выспаться, и разобрать по полкам свои мысли, и справиться с домашними делами, и встретиться с друзьями, и побаловать себя чем-то вкусненьким, и посмотреть интересный фильм, и пройтись по магазинам, и помечтать о самом главном, и просто отдохнуть от всех своих проблем! \uD83C\uDF7A");
        return randomValueList(list);
    }

    private static String getSaturday() {
        List<String> list = new ArrayList<>();
        list.add("Вот и суббота настала, а значит, пора отдыхать, улыбаться, радоваться жизни на полную катушку и расслабляться.\n" +
                "Пусть выходные не заканчиваются, а погода будет прекрасной, теплой и солнечной!");
        list.add("Поздравляю с субботой. Желаю отключить себя от суеты, переживаний и постоянных хлопот, а подключить к источнику питания энергией, хорошим настроением и усладой\n" +
                "Пусть этот день пройдёт отлично, пусть в нём будут все те, кого желает видеть твоё сердце и происходит всё, что угодно твоей душе.");
        list.add("Ну, кто сказал, что праздник наступает только тогда, когда есть особый повод? \n" +
                "Суббота — идеальная причина для радости и поздравлений. \n" +
                "А поэтому поздравляю и желаю весёлой, увлекательной, интересной субботы без трудной работы. \n" +
                "Пусть отдыхает тело и душа. Пусть о любви поёт сердце и твоя вторая половинка. \n" +
                "Желаю отличного настроения и абсолютного везения абсолютно во всём");
        return randomValueList(list);
    }


    private static String getMonday() {
        List<String> list = new ArrayList<>();
        list.add("Понедельник наступил,\n" +
                "Значит надо много сил\n" +
                "Чтоб хватило до субботы,\n" +
                "Переделать всю работу!\n" +
                "\n" +
                "Пожелаю, чтоб от лени\n" +
                "Не осталось даже тени.\n" +
                "Понедельник — день хороший,\n" +
                "Если верить, что все сможешь!\uD83D\uDE01");
        list.add("Понедельник день прекрасный,\n" +
                "Пусть он радость принесет,\n" +
                "Пусть не будет он ненастным\n" +
                "Солнце пусть в душе встает.\n" +
                "\n" +
                "В этот день не унывайте,\n" +
                "Счастья всем вы пожелайте,\n" +
                "Добрых дел вам на весь день,\n" +
                "И улыбок встречным всем! \uD83D\uDE01");
        list.add("С понедельником тебя, с новым днём чудесным,\n" +
                "Пусть неделя эта будет лёгкой, словно песня,\n" +
                "Понедельник пусть пройдёт радостно и быстро,\n" +
                "Пусть не будет у тебя даже грустных мыслей! \uD83D\uDE01");
        list.add("С понедельником тебя,\n" +
                "Пусть этот день пройдет не зря,\n" +
                "Желаю нового узнать,\n" +
                "Удачу, радость испытать,\n" +
                "Пусть все с утра легко дается\n" +
                "И целый день сияет солнце \uD83D\uDE01");
        return randomValueList(list);
    }


    private static String getTuesday() {
        List<String> list = new ArrayList<>();
        list.add("Сегодня вторник. Доброго утра!\n" +
                "Давно вам на работу уж пора!\n" +
                "До пятницы осталось не так много,\n" +
                "А там суббота ждёт нас за порогом.\n" +
                "И будут пиво, танцы и веселье,\n" +
                "Отрыв, улет и супер-настроенье.\n" +
                "Всего три дня осталось до субботы.\n" +
                "Ну, а пока чеши-ка на работу!");
        list.add("Пусть твой вторник классно сложится\n" +
                "И хорошее умножится!\n" +
                "За тебя переживаю,\n" +
                "Дня отличного желаю!");
        list.add("Утро, вторник – чудный день!\n" +
                "Просыпайся, друг мой! Лень?\n" +
                "Если нам её прогнать\n" +
                "И активней просто стать?\n" +
                "Лишь с улыбочкой мечтать,\n" +
                "А не злиться, не стонать!\n" +
                "Вот таков залог успеха –\n" +
                "Тайна супер-человека!");
        return randomValueList(list);
    }


    private static String getWednesday() {
        List<String> list = new ArrayList<>();
        list.add("Поздравляю со средой!\n" +
                "Пусть веселой чередой\n" +
                "Часы летят, летят минуты,\n" +
                "Пускай получится все круто.\n" +
                "\n" +
                "Блестящих вам идей, проектов,\n" +
                "Пусть юмор, как большой проектор,\n" +
                "Проблемы превращает в шутку,\n" +
                "Пусть будет каждый встречный — чутким!");
        list.add("Поздравляю, вот среда!\n" +
                "Еще немного — выходные,\n" +
                "Легче день пройдет, добра\n" +
                "И смеха, легкости в пути вам.\n" +
                "\n" +
                "Пусть все быстренько решится,\n" +
                "Не забудьте подкрепиться,\n" +
                "День прекрасный, улыбнись,\n" +
                "На добро лишь отзовись!");
        list.add("Среда — это маленькая пятница,\n" +
                "С этим поздравить спешу,\n" +
                "Неделя к завершению катится,\n" +
                "А вот тебе пишу.\n" +
                "\n" +
                "Пусть день хорошо закончится,\n" +
                "Настроение пусть не пропадет,\n" +
                "И если поговорить захочется,\n" +
                "Твой друг всегда время найдет.\n");
        list.add("Как скорый поезд мчат года,\n" +
                "И за окошком дни мелькают,\n" +
                "Сегодня важная среда\n" +
                "Для дел везучих наступает.\n" +
                "\n" +
                "Смекалку на всю мощь включи\n" +
                "И малость приложи старанья,\n" +
                "И жизнь от счастья даст ключи\n" +
                "И воплотит твои желанья!");
        return randomValueList(list);
    }


    private static String getThursday() {
        List<String> list = new ArrayList<>();
        list.add("Четверг-отличный день недели,\n" +
                "Четверг как будто близко выходной.\n" +
                "Вот был уж понедельник, неужели —\n" +
                "Мы скоро отдохнем с тобой!");
        list.add("Настоящий фейерверк —\n" +
                "Начинается четверг.\n" +
                "Пусть везёт тебе во всём,\n" +
                "Полной чашей будет дом.\n" +
                "\n" +
                "На работе хоть куда —\n" +
                "Будешь новая звезда.\n" +
                "Хочу, чтобы не поверг\n" +
                "В слёзный пыл тебя четверг");
        list.add("Приход четверга озаряя,\n" +
                "На небо взбирается солнце.\n" +
                "Тебе в этот день я желаю:\n" +
                "Пусть всё, что в мечтах, удаётся!\n" +
                "\n" +
                "И станут прекрасные встречи\n" +
                "Четверг заполнять до минуты.\n" +
                "И сможешь сегодня, конечно,\n" +
                "К успеху построить маршруты!");
        list.add("Четверг пришел, а это значит,\n" +
                "Что выходные уже близко.\n" +
                "Лови за хвост скорей удачу.\n" +
                "Пусть зажигает четверг искру.\n" +
                "\n" +
                "Пусть труд твой будет креативным.\n" +
                "Жизнь интересный даст сюжет.\n" +
                "Пусть день пройдет на позитиве.\n" +
                "Усталости тут места нет.\n" +
                "\n");
        return randomValueList(list);
    }

    public static String getSimpleDateFormat(String pattern) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat(pattern);
        return formatForDateNow.format(dateNow);
    }
}
