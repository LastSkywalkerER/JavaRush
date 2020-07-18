package day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if ( a == b && b == c) System.out.println(a + " " + b + " " + c);
        else if ( a == b ) System.out.println(a + " " + b);
        else if ( b == c ) System.out.println(b + " " + c);
        else if ( a == c ) System.out.println(a + " " + c);


    }
}





