package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.println(" is leap - " + isLeap(year));

        LocalDate date = LocalDate.of(year,1,1);
        System.out.println(date.isLeapYear());
    }

    public static boolean isLeap(int year){
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}
