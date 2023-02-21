package com.softserve.edu05.homeWork;

import java.util.Scanner;

import static java.lang.System.*;
public class NumberMonth {
    public static void main(String[] args) {

        System.out.println("Enter the number of month  ");

        Scanner br = new Scanner(System.in);

        String input = br.nextLine();

        int month = Integer.parseInt(input);
        String result = switch (input.toLowerCase()) {
            case "1" -> "January";
            case "2" -> "February";
            case "3" -> "March";
            case "4" -> "April";
            case "5" -> "May";
            case "6" -> "June";
            case "7" -> "July";
            case "8" -> "August";
            case "9" -> "September";
            case "10" -> "October";
            case "11" -> "November";
            case "12" -> "December";
            default -> "Enter a number from 1 to 12!";
        };

        System.out.println(result);

        int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 1)
            System.out.println(result + " has " + monthDays[0] + " days");

        else if (month == 2)
            System.out.println(result + " has " + monthDays[1] + " days");

        else if (month == 3)
            System.out.println(result + " has " + monthDays[2] + " days");

        else if (month == 4)
            System.out.println(result + " has " + monthDays[3] + " days");

        else if (month == 5)
            System.out.println(result + " has " + monthDays[4] + " days");

        else if (month == 6)
            System.out.println(result + " has " + monthDays[5] + " days");

        else if (month == 7)
            System.out.println(result + " has " + monthDays[6] + " days");

        else if (month == 8)
            System.out.println(result + " has " + monthDays[7] + " days");

        else if (month == 9)
            System.out.println(result + " has " + monthDays[8] + " days");

        else if (month == 10)
            System.out.println(result + " has " + monthDays[9] + " days");

        else if (month == 11)
            System.out.println(result + " has " + monthDays[10] + " days");

        else if (month == 12) {
            System.out.println(result + " has " + monthDays[11] + " days");

        }
    }
}
