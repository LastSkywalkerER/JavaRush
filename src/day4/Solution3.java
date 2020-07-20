package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int a = Integer.parseInt(bufferedReader.readLine());

        String[] strs = new String[10];
        int[] ints = new int[10];

        for (int i = 0; i < 10; i++) {
            strs[i] = bufferedReader.readLine();
        }

        for (int i = 0; i < 10; i++) {
            ints[i] = strs[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ints[i]);
        }

    }
}