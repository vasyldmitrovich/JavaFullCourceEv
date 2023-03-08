package com.softserve.edu13.homework.task4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2004, 8, 27);
        System.out.println("Date of birthday: " + birthday);

        dayOfWeakAfterSixMonths(birthday);
        dayOfWeakAfterTwelveMonths(birthday);
    }

    public static void dayOfWeakAfterSixMonths(LocalDate date) {
        date = date.plusMonths(6);
        System.out.println("\nDate after 6 months: " + date
                + "\nDay of week in this date: " + date.getDayOfWeek());
    }

    public static void dayOfWeakAfterTwelveMonths(LocalDate date) {
        date = date.plusMonths(12);
        System.out.println("\nDate after 6 months: " + date
                + "\nDay of week in this date: " + date.getDayOfWeek());
    }
}
