package day10;


/*
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        List<Character> vowels = new ArrayList<>();
        List<Character> notVowels = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) !=  ' ') {
                if (isVowel(str.charAt(i))) {
                    vowels.add(str.charAt(i));
                } else {
                    notVowels.add(str.charAt(i));
                }
            }
        }

        for (Character ch : vowels) {
            System.out.print(ch + " ");
        }

        System.out.println();

        for (Character ch : notVowels) {
            System.out.print(ch + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}