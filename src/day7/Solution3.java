package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код

        String[] newString = string.split(" ");

        for (int i = 0; i < newString.length; i++) {
            String[] word = newString[i].split("");
            word[0] = word[0].toUpperCase();
            newString[i] = String.join("", word);
        }

        string = String.join(" ", newString);

        System.out.println(string);
    }
}









