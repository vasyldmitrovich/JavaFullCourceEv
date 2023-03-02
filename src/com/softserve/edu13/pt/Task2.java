package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class Task2 {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        LocalDate now = LocalDate.now();
        LocalDate firstMonday = now.with(firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMonday);
    }
}
