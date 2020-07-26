package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Минимальное из N чисел
*/

public class Solution3 {
    public static void main(String[] args) throws Exception {
        List<String> monthsList = getMonthList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        System.out.println(month + " is the " + (getNumberOfMonth(monthsList, month)+1) + " month");
    }

    public static int getNumberOfMonth(List<String> array, String month) throws IOException {
        // Найти минимум тут

        return array.indexOf(month);
    }

    public static List<String> getMonthList() throws IOException {
        // Создать и заполнить список тут
        List<String> monthsList = new ArrayList<String>();

        monthsList.add("January");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        monthsList.add("May");
        monthsList.add("June");
        monthsList.add("July");
        monthsList.add("August");
        monthsList.add("September");
        monthsList.add("October");
        monthsList.add("November");
        monthsList.add("December");

        return monthsList;
    }
}