package com.softserve.edu13.practicalTasks.task1;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        outCurrentDay();
        outFirstMondayOfMonth();
        sortListOfString(Arrays.asList("Max", "Igor", "Orest", "Bohdan", "Anna"));
    }

    public static void outCurrentDay() {
        LocalDate currentDate = LocalDate.now();
        int currentDay = currentDate.getDayOfMonth();

        System.out.println("\nToday's day: " + currentDay);
    }

    public static void outFirstMondayOfMonth() {
        LocalDate currentDate = LocalDate.now();
        TemporalAdjuster firstMondayOfMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);

        System.out.println("The first Monday of this month: " + currentDate.with(firstMondayOfMonth));
    }

    public static void sortListOfString(List<String> list) {
        System.out.print("\nSorted list: ");
        list.stream().sorted().forEach(value -> System.out.print(value + " "));
        System.out.println();
    }
}
