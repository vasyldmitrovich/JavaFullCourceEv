package com.softserve.edu13.practical.task1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        LocalDate date = LocalDate.now();
        System.out.println("Today is - " + date.getDayOfWeek());
        System.out.println("Сьогодні - " + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()).toUpperCase());
    }
}
