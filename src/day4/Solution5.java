package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution5 {

    public static int[] initializeArray() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        return array;
    }

    public static int max(int[] arr) {

        int max = arr[1];
        for (int i = 0; i < 20; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }

    public static void main(String[] args) throws IOException {

        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);

    }
}