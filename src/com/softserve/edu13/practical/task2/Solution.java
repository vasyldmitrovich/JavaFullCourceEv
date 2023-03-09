package com.softserve.edu13.practical.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Solution {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        LocalDate date = LocalDate.now();
        TemporalAdjuster adjuster = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        LocalDate newDate = date.with(adjuster);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String output = formatter.format(newDate);
        System.out.println(output+"р.");
    }
}
