package day5;

import java.io.IOException;
import java.util.ArrayList;

public class Solution4 {

    public static void main(String[] args) throws IOException {


        // int a = Integer.parseInt(bufferedReader.readLine());

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");
        strings = fix(strings);

        // list.size();
        // list.get(i);
        // list.set(i,s);
        // list.add(s); добавление в конец
        // list.add(i,s); добавление в середину
        // list.remove(i);



        for (String string : strings) {
            System.out.println(string);
        }

    }

    public static Boolean ifContaine(String s, String sub) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(sub) != -1) return true;
        }
        return false;
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 1; i <= strings.size(); i += 2) {
            strings.add(i, "именно");
        }
        return strings;
    }

}
