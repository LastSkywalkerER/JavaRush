package day5;

import java.io.IOException;
import java.util.ArrayList;

public class Solution3 {

    public static void main(String[] args) throws IOException {


        // int a = Integer.parseInt(bufferedReader.readLine());

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
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
        for (int i = 0; i < strings.size();) {
            if (ifContaine(strings.get(i), "р") && !ifContaine(strings.get(i), "л")) {
                strings.remove(i);
            } else if (!ifContaine(strings.get(i), "р") && ifContaine(strings.get(i), "л")) {
                String temp = strings.get(i);
                strings.add(i, temp);
                i +=2;
            } else i++;
        }
        return strings;
    }

}
