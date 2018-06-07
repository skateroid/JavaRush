package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date2 = new Date(date);
        Date yearStart = new Date();
        yearStart.setHours(0);
        yearStart.setMinutes(0);
        yearStart.setSeconds(0);
        yearStart.setDate(1);
        yearStart.setMonth(0);
        yearStart.setYear(date2.getYear());
        long msAllDays = date2.getTime() - yearStart.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msAllDays/msDay);
        if (dayCount % 2 == 0) {
            return false;
        }
        else return true;
    }
}
