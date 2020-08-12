package day12;

import java.util.*;

/*
Нам повторы не нужны
*/

public class Solution6 {
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
        map.put("Сталлоне2", "Иваныч1");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();

        for (Map.Entry entry : map.entrySet()) {
            if (Collections.frequency(map.values(), entry.getValue()) > 1) {
                list.add((String) entry.getValue());
            }
        }
        for (String name : list) {
            removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}