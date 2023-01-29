package com.softserve.edu04.practical.Task2;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DayNumber {
    public static int inputDayOfTheWeek() {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = 0;
        while (dayOfWeek < 1 || dayOfWeek > 7) {
            try {
                dayOfWeek = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("You input invalid data. Please input number from 1 to 7!");
            }
            if (dayOfWeek < 0 || dayOfWeek > 7) {
                System.out.println("You input invalid data. Please input number from 1 to 7!");
            }
        }
        return dayOfWeek;
    }

    public static void outputDayOfTheWeek() {
        int day = inputDayOfTheWeek();
        String german = DayOfWeek.of(day).getDisplayName(TextStyle.FULL, Locale.GERMAN).toUpperCase();
        String english = DayOfWeek.of(day).getDisplayName(TextStyle.FULL, Locale.UK).toUpperCase();
        String ukrainian = DayOfWeek.of(day).getDisplayName(TextStyle.FULL, Locale.getDefault()).toUpperCase();
        String italian = DayOfWeek.of(day).getDisplayName(TextStyle.FULL, Locale.ITALIAN).toUpperCase();
        String french = DayOfWeek.of(day).getDisplayName(TextStyle.FULL, Locale.FRENCH).toUpperCase();
        String chinese = DayOfWeek.of(day).getDisplayName(TextStyle.FULL, Locale.CHINESE).toUpperCase();
        System.out.println("Day of week №" + day + " in different languages:\n" +
                "• in German - " + german + ";\n" +
                "• in English - " + english + ";\n" +
                "• in Ukrainian - " + ukrainian + ";\n" +
                "• in Italian - " + italian + ";\n" +
                "• in French - " + french + ";\n" +
                "• in Chinese - " + chinese);
    }
}
