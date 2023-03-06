package com.softserve.edu12.homework.task1;

import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        try {
            System.out.println("Please input first float number:");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input second float number:");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(div(a, b));
        } catch (NumberFormatException e) {
            System.out.println("You input not a float");
            e.printStackTrace();
        }
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
