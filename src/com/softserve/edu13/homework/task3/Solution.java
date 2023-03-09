package com.softserve.edu13.homework.task3;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(isLeap(2000));
        System.out.println(isLeap(1900));
        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(LocalDate.ofYearDay(2000, 1).isLeapYear());
        System.out.println(LocalDate.ofYearDay(1900, 1).isLeapYear());
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
    }

    public static String isLeap(int year) {
        return ((year % 100 != 0) || (year % 400 == 0) && (year % 4 == 0)) ? year + " year is a leap" : year + " year is not a leap";
    }

    public static boolean isLeapYear(long prolepticYear) {
        return ((prolepticYear & 3) == 0) && ((prolepticYear % 100) != 0 || (prolepticYear % 400) == 0);
    }
}
