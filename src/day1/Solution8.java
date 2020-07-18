package day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution8 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());

        if (a > 0) {
            if (a % 2 == 0) System.out.println("положительное четное число");
            else System.out.println("положительное нечетное число");
        } else if (a < 0) {
            if (a % 2 == 0) System.out.println("отрицательное четное число");
            else System.out.println("отрицательное нечетное число");
        } else System.out.println("ноль");

    }
}