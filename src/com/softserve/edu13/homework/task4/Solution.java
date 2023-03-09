package com.softserve.edu13.homework.task4;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        LocalDate birthday = LocalDate.of(1991, 3, 12);
        displayDayOfWeek(birthday);
    }

    public static void displayDayOfWeek(LocalDate date) {
        System.out.println("My birthday day was " + date.getDayOfWeek()
                + " (" + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()) + ")");
        System.out.println("6 month later was " + date.plusMonths(6).getDayOfWeek()
                + " (" + date.plusMonths(6).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()) + ")");
        System.out.println("1 year later was " + date.plusYears(1).getDayOfWeek()
                + " (" + date.plusYears(1).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()) + ")");
    }
}
