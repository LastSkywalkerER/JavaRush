package day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int a = Integer.parseInt(bufferedReader.readLine());

        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 20; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 10; i < 20; i++) {
            arr2[i-10] = arr[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr2[i]);
        }

    }
}