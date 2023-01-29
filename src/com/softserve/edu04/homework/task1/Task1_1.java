package com.softserve.edu04.homework.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Please enter a number. Use \",\" to enter float number:");
        while (i < 3) {
            try {
                System.out.println(isInRange(scanner.nextFloat()));
            }
            catch (InputMismatchException exception) {
                System.out.println("You have entered not a number. Use \",\" to enter float number");
                break;
            }
            i++;
        }
    }

    public static boolean isInRange(float number) {
        return number >= -5 && number <= 5;
    }
}
