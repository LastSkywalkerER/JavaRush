package Day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution1 {

    private static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int a = Integer.parseInt(bufferedReader.readLine());

        Solution1.strings = new ArrayList<String>();
        ArrayList<String> maxList = new ArrayList<String>();

        // list.size();
        // list.get(i);
        // list.set(i,s);
        // list.add(s); добавление в конец
        // list.add(i,s); добавление в середину
        // list.remove(i);


        int maxSize = Integer.MIN_VALUE, minPos = 0;
        int count = 0;

        for (int i = 0; i < 5; i++) {
            String a = bufferedReader.readLine();
            Solution1.strings.add(a);

            if (Solution1.strings.get(i).length() > maxSize) {
                maxSize = Solution1.strings.get(i).length();
                minPos = i;
            }

        }

        for (int i = 0; i < 5; i++) {

            if (Solution1.strings.get(i).length() == maxSize) {
                maxList.add(Solution1.strings.get(i));
            }

        }

        for (int i = 0; i < maxList.size(); i++) {
            System.out.println(maxList.get(i));
        }


    }
}
