package day8;


/*
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution4 {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date newDate = formatter.parse(date);

        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11
        yearStartTime.setYear(newDate.getYear());

        long msInDay = 24 * 60 * 60 * 1000;
        double dayCount = (double) (newDate.getTime()-yearStartTime.getTime())/msInDay;

        System.out.println(newDate.getTime());
        System.out.println(yearStartTime.getTime());
        System.out.println((int) (dayCount+0.5)+1);

        if (((int) (dayCount+0.5)+1) % 2 != 0) return true;
        else return  false;


    }
}