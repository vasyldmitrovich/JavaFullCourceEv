package com.softserve.edu05.homework.task1;

import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        int[] calendar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter number of the month to receive quantity of days in chosen month: ");
        int number = 0;
        while (number <= 0 || number > 12) {
            try {
                number = new Scanner(System.in).nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("You input not Integer. Please try again input correct data!");
            }
            if (number < 0) {
                System.out.println("Number of month can not be negative!");
            }
            if (number == 0) {
                System.out.println("Please enter valid number of month!");
            }
            if (number > 12) {
                System.out.println("There are only 12 month in a year!");
            }
            if (number == 2) {
                System.out.println("There are " + calendar[number]+1
                        + " days in " + Month.of(number) + " in a leap year");
                System.out.println("There are " + calendar[number]
                        + " days in " + Month.of(number) + " not in a leap year");
            }
            else {
                for (int i = 0; i < calendar.length; i++) {
                    if (i == number - 1) {
                        System.out.println("There are " + calendar[i] + " days in " + Month.of(number));
                    }
                }
            }
        }
    }
}
