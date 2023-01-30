package com.softserve.edu04.practical.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        try {
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
            number3 = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("You input not Integer. Program failed. Restart app and try again");
        }
        System.out.println("\nTotal quantity of odd numbers among all scanned numbers is - " + oddQuantity(number1, number2, number3));
    }

    public static int oddQuantity(int x, int y, int z) {
        int quantity = 0;
        if (x % 2 == 1) {
            quantity++;
        }
        if (y % 2 == 1) {
            quantity++;
        }
        if (z % 2 == 1) {
            quantity++;
        }
        return quantity;
    }
}
