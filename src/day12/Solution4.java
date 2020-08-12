package day12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution4 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлон", dateFormat.parse("MAY 2 2012"));
        map.put("Сталло", dateFormat.parse("MAY 3 2012"));
        map.put("Сталл", dateFormat.parse("MAY 4 2012"));
        map.put("Стал", dateFormat.parse("MAY 5 2012"));
        map.put("Ста", dateFormat.parse("MAY 6 2012"));
        map.put("Ст", dateFormat.parse("MAY 7 2012"));
        map.put("С", dateFormat.parse("MAY 8 2012"));
        map.put("Сталлоне1", dateFormat.parse("MAY 9 2012"));
        map.put("Сталлоне2", dateFormat.parse("JUNE 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код

        Calendar cal = Calendar.getInstance();
        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            cal.setTime((Date) entry.getValue());
            int month = cal.get(Calendar.MONTH);
            if (month == 5 || month == 6 || month == 7) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        System.out.println(map);
        removeAllSummerPeople(map);
        System.out.println(map);
    }
}