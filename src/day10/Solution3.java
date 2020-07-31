package day10;

/*
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String strDate = reader.readLine();

        SimpleDateFormat dateFormatInput = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        Date date = dateFormatInput.parse(strDate);

        System.out.println(dateFormatOutput.format(date).toUpperCase());
    }
}