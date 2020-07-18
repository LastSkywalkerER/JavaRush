package day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution9 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());

        if (a % 2 == 0) {
            if (a < 10 && a > 0) System.out.println("четное однозначное число");
            else if (a < 100 && a > 0) System.out.println("четное двузначное число");
            else if (a < 1000 && a > 0) System.out.println("четное трехзначное число");
        } else {
            if (a < 10 && a > 0) System.out.println("нечетное однозначное число");
            else if (a < 100 && a > 0) System.out.println("нечетное двузначное число");
            else if (a < 1000 && a > 0) System.out.println("нечетное трехзначное число");
        }

    }
}