package day12;


/*
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bis.readLine());

    }

    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(readInt());
        }

        int maxCount = 0;
        int count = 0;
        for (int i = 1; i < 10; i++) {

            if (list.get(i).equals(list.get(i-1))) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
            } else count = 0;
        }

        System.out.println(maxCount+1);
    }


}