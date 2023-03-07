package com.softserve.edu12.practicalTasks.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int a = getNumber("a");
            int b = getNumber("b");
            areaOfRectangle(a, b);
        } catch (InputMismatchException e) {
            System.out.println("You have written the wrong type :/");
        } catch (ArithmeticException e) {
            System.out.println("You wrote negative number :/");
        }
    }

    public static int getNumber(String text) {
        System.out.print("Enter the " + text + ": ");
        return scanner.nextInt();
    }

    public static void areaOfRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException();
        }
        System.out.println("The area of the rectangle: " + a * b);
    }
}
