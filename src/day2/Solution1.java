package day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution1 {

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


        int minSize = Integer.MAX_VALUE, minPos = 0;
        int maxSize = Integer.MIN_VALUE, maxPos = 0;
        for (int i = 0; i < 10; i++) {
            String a = bufferedReader.readLine();
            list.add(a);
            if (list.get(i).length() < minSize) {
                minSize = list.get(i).length();
                minPos = i;
            }
            if (list.get(i).length() > maxSize) {
                maxSize = list.get(i).length();
                maxPos = i;
            }
        }

        System.out.println(maxPos < minPos ? list.get(maxPos) : list.get(minPos));

    }
}
