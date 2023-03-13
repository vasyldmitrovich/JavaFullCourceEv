package com.softserve.edu17teamWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 {
    static Scanner scanner = new Scanner(System.in);
    static String one[] = {"", "one ", "two ", "three ", "four ",
            "five ", "six ", "seven ", "eight ",
            "nine ", "ten ", "eleven ", "twelve ",
            "thirteen ", "fourteen ", "fifteen ",
            "sixteen ", "seventeen ", "eighteen ",
            "nineteen "};

    static String ten[] = {"", "", "twenty ", "thirty ", "forty ",
            "fifty ", "sixty ", "seventy ", "eighty ",
            "ninety "};

    public static void main(String[] args) {
        run();
    }


    public static void run() {
        System.out.print("Please input any integer from 1 to 1_000_000 and the application will output it like a string: ");
        int number = getUserInput();
        System.out.println(convertToWords(number));
        }



    public static int getUserInput() {
        int number = 0;
        while (number == 0) {
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (InputMismatchException e) {
                System.out.println("Please input data according task!");
            }
        }
        return number;
    }

    public static String numToWords(int n, String s) {
        String str = "";
        if (n > 19) {
            str += ten[n / 10] + one[n % 10];
        } else {
            str += one[n];
        }

        if (n != 0) {
            str += s;
        }
        return str;
    }

    static String convertToWords(long n)
    {
        String output = "";
        output += numToWords((int)((n / 100000) % 100), "hundred ");
        output += numToWords((int)((n / 1000) % 100), "thousand ");
        output += numToWords((int)((n / 100) % 10), "hundred ");

        if (n > 100 && n % 100 > 0) {
            output += "and ";
        }
        output += numToWords((int)(n % 100), "");

        return output;
    }

}
