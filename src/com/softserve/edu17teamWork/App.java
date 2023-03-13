package com.softserve.edu17teamWork;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world! \n Enter the number of the problem you want to solve (1-10):");
        System.out.println("1.\tInput number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
        System.out.println("2.\tInput number and decompose this number into a product of prime numbers with their degrees (e.g. number: 84, result 2^2, 3, 7)");
        System.out.println("3.\tInput cost of dollar and sum of money in gryvna. Calculate how many dollars user can buy and change.");
        System.out.println("4.\tInput string and calculate number of loud letters (e.g. word: “My test text”, result: 3)");
        System.out.println("5.\tInput string and check if this string is palindrome (e.g. “ABCCBA”)");
        System.out.println("6.\tInput text and calculate number of words in this text");
        System.out.println("7.\tInput number n and calculate n! (e.g. 5! = 1*2*3*4*5 = 120)");
        System.out.println("8.\tInput number in range from 1 to 1 000 000 and output this number in English");
        System.out.println("9.\tWrite method to return random value 0 or 1. Input number n, call this method n times and calculate how many times were number one");
        System.out.println("10.\tFind the number of steps for which you get 1, using the following process: we take any\n" +
                " the natural number n is greater than one. If it is even, then divide it by 2, and if it is odd, then\n" +
                " multiply by 3 and add 1");
        System.out.println("0 - Exit.");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        do {
            switch (choice) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("You entered something wrong, please try again");
                    break;
            }
        } while (choice != 0);
        System.out.println("Good bye!");
    }
}
