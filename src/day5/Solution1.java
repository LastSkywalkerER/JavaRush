package Day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int a = Integer.parseInt(bufferedReader.readLine());

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> maxList = new ArrayList<String>();

        // list.size();
        // list.get(i);
        // list.set(i,s);
        // list.add(s); добавление в конец
        // list.add(i,s); добавление в середину
        // list.remove(i);


        int size = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            String a = bufferedReader.readLine();
            list.add(a);
        }

        for (int i = 0; i < 10; i++) {

            if (list.get(i).length() >= size) {
                size = list.get(i).length();
            } else {
                System.out.println(i);
                break;
            }

        }

    }
}
