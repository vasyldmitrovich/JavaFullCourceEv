package com.softserve.edu05.homeWork;

import java.util.Scanner;

public class NumberMonth {
    public static void main(String[] args) {

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner br = new Scanner(System.in);
        System.out.println("Enter the number of month  ");
        int days;
        int numberMonth = br.nextInt();
        String result = switch (numberMonth) {
            case 1 -> "January!";
            case 2 -> "February!";
            case 3 -> "March!";
            case 4 -> "April!";
            case 5 -> "May!";
            case 6 -> "June!";
            case 7 -> "July!";
            case 8 -> "August!";
            case 9 -> "September!";
            case 10 -> "October!";
            case 11 -> "November!";
            case 12 -> "December!";
            default -> "Enter a number from 1 to 12!";
        };
        System.out.println(result);
        for (int i = 0; i < monthDays.length - 1; i++) {
            if (numberMonth <= monthDays.length) {
                System.out.println(monthDays[numberMonth - 1]);
                break;
            }
        }
    }
}
