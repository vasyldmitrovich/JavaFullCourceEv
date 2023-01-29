package com.softserve.edu04.practical.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5]; // You may place any quantity of numbers you want to read from console
        for (int i = 0; i < array.length; i++) {
                try {
                    array[i] = scanner.nextInt();
                } catch (InputMismatchException exception) {
                    System.out.println("You input not Integer. Program failed. Restart app and try again");
                    break;
                }
                finally {
                    System.out.println("App read your number - " + array[i] + "\n");
                }
            }
        System.out.println("Total scanned numbers is - " + array.length);
        System.out.println("\nTotal quantity of odd numbers among all scanned numbers is - " + oddQuantity(array));
        scanner.close();
    }

    public static int oddQuantity(int[] numbers) {
        int quantity = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                quantity++;
            }
        }
        return quantity;
    }
}
