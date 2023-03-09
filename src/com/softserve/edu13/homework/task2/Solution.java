package com.softserve.edu13.homework.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Solution {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        LocalDate date = LocalDate.now();
        System.out.println(dateFormatValidator(date));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        String newFormat = formatter.format(date);
        System.out.println(newFormat);
        LocalDate newFormatDate = LocalDate.parse(newFormat,formatter); //not working :(
        System.out.println(newFormatDate);
        System.out.println(dateFormatValidator(newFormatDate));
    }

    public static boolean dateFormatValidator (LocalDate date) {
        boolean isValid = true;
        String stringDate = date.toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(stringDate, formatter);
        } catch (DateTimeParseException exception) {
            isValid = false;
        }
        return isValid;
    }
}
