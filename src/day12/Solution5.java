package day12;

import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
*/

public class Solution5 {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Сталлоне", "Иваныч");
        map.put("Сталлон", "Иваныч");
        map.put("Сталло", "Иваныч");
        map.put("Сталл", "Иваныч");
        map.put("Стал", "Иваныч");
        map.put("Ста", "Иваныч");
        map.put("Ст", "Иваныч");
        map.put("С", "Иваныч");
        map.put("Сталлоне1", "Иваныч");
        map.put("Сталлоне2", "Иваныч");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == name) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() == lastName) count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}








