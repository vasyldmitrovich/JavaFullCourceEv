package com.softserve.edu13.homework.task3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        checkLeapYear(currentDate.getYear());

        LocalDate date = LocalDate.of(2000, 1, 1);
        checkLeapYear(date.getYear());

        checkLeapYear(1992);
    }

    public static void checkLeapYear(int year){
        if(isLeapYear(year)){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
