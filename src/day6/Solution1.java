package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int a = Integer.parseInt(bufferedReader.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> listR = new ArrayList<Integer>();

        // list.size();
        // list.get(i);
        // list.set(i,s);
        // list.add(s); добавление в конец
        // list.add(i,s); добавление в середину
        // list.remove(i);


        for (int i = 0; i < 20; i++) {
            int a = Integer.parseInt(bufferedReader.readLine());
            list.add(a);
        }

        for (int i = 0; i < 20; i++) {

            if (list.get(i) % 3 == 0) list3.add(list.get(i));
            if (list.get(i) % 2 == 0) list2.add(list.get(i));
            if (list.get(i) % 3 != 0 && list.get(i) % 2 != 0) listR.add(list.get(i));

        }

        printList(list3);
        printList(list2);
        printList(listR);

    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
