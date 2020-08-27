package day13;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код

        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < alphabet.size(); i++) {
            counter.put(alphabet.get(i), 0);
        }

        for (int i = 0; i < 10; i++) {
            for (Character letter : list.get(i).toCharArray()) {
                if (counter.containsKey(Character.toLowerCase(letter))) counter.replace(Character.toLowerCase(letter), counter.get(Character.toLowerCase(letter)) + 1);
            }
        }

        for (Character letter : alphabet) {
            System.out.println(letter + " " + counter.get(letter));
        }

    }
}
