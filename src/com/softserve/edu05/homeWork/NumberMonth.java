package com.softserve.edu05.homeWork;

import java.util.Scanner;

public class NumberMonth {
    public static void main(String[] args) {
        System.out.println("Enter the number of month  ");
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        Scanner br = new Scanner(System.in);
        String input = br.nextLine();
        int numberMonth = br.nextInt();
     /*   String result;

        switch (input.toLowerCase()) {
            case "1":
                result = "January!";
                break;
            case "2":
                result = "February!";
            case "3":
                result = "March!";
                break;
            case "4":
                result = "April!";
                break;
            case "5":
                result = "May!";
                break;
            case "6":
                result = "June!";
                break;
            case "7":
                result = "July!";
                break;
            case "8":
                result = "August!";
                break;
            case "9":
                result = "September!";
                break;
            case "10":
                result = "October!";
                break;
            case "11":
                result = "November!";
                break;
            case "12":
                result = "December!";
                break;

            default:
                result = "Enter a number from 1 to 12!";
        }
        System.out.println(result);
*/

        for (int monthDay : monthDays) {
            if (numberMonth >0) {
                var b = numberMonth == monthDay;
                System.out.println(monthDay);
            }
        }
    }
}
