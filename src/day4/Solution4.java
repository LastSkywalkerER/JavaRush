package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int a = Integer.parseInt(bufferedReader.readLine());

        String[] strs = new String[10];

        for (int i = 0; i < 8; i++) {
            strs[i] = bufferedReader.readLine();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(strs[i]);
        }

    }
}