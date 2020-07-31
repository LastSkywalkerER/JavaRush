package day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        Map<Integer, String> str = new HashMap<>();
        int[] pozStr = new int[array.length];

        Map<Integer, String> num = new HashMap<>();
        int[] pozNum = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int strCounter = 0;
            int numCounter = 0;
            if (isNumber(array[i])) {
                num.put(i, array[i]);
                pozNum[numCounter++] = i;
            } else {
                str.put(i, array[i]);
                pozStr[strCounter++] = i;
            }
        }

        for (int i = 1; i < num.size(); i++) {
            for (int k = 0; k < num.size() - i; k++) {
                if (isGreaterThan(num.get(pozNum[k]), num.get(pozNum[k] + 1))) {
                    String temp = num.get(pozNum[k]);
                    num.put(pozNum[k], num.get(pozNum[k] + 1));
                    num.put(pozNum[k] + 1, temp);
                }
            }
        }

        for (int i = 1; i < str.size(); i++) {
            for (int k = 0; k < str.size() - i; k++) {
                if (!isGreaterThan(str.get(pozStr[k]), str.get(pozStr[k] + 1))) {
                    String temp = str.get(pozStr[k]);
                    num.put(pozStr[k], str.get(pozStr[k] + 1));
                    str.put(pozStr[k] + 1, temp);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (num.containsKey(i)) {
                array[i] = num.get(i);
            } else {
                array[i] = str.get(i);
            }
        }

    }



    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}