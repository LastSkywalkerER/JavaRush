package day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int a = Integer.parseInt(bufferedReader.readLine());

        ArrayList<String> list = new ArrayList<String>();

        // list.size();
        // list.get(i);
        // list.set(i,s);
        // list.add(s); добавление в конец
        // list.add(i,s); добавление в середину
        // list.remove(i);


        for (int i = 0; i < 5; i++) {
            String a = bufferedReader.readLine();
            list.add(a);
        }

        for (int i = 0; i < 13; i++) {
            String s = list.get(4);
            list.remove(4);
            list.add(0, s);
                    }


        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
