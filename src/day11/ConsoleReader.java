package day11;


/*
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        return bis.readLine();

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bis.readLine());

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(bis.readLine());

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(bis.readLine());
    }

    public static void main(String[] args) throws Exception {

    }
}