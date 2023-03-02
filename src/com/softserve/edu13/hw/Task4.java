package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        LocalDate myDate = LocalDate.of(1996,7,4);
        howDay(myDate);
    }

    public static void howDay(LocalDate date) {
        System.out.println("day of week - " + date.getDayOfWeek() + " : " + date);
        System.out.println("day of week after 6 month - " + date.plusMonths(6).getDayOfWeek());
        System.out.println("day of week after 12 month - " + date.plusMonths(12).getDayOfWeek());
    }
}
