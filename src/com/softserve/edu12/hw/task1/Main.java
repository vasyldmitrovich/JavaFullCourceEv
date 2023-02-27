package com.softserve.edu12.hw.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            double first = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double second = scanner.nextDouble();
            System.out.println(first + " / " + second + " = " + div(first, second));
        } catch (InputMismatchException e){
            System.err.println("you didn't enter a number (double number must be entered separated by commas)");
        }
    }
    private static double div(double first, double second) {
        double third = 0;
        try{
            if(second == 0) {
                throw new ArithmeticException();
            } else { third = first / second; }
        } catch (ArithmeticException e){
            System.err.println(" dividing by zero not allowed");
        }
        return third;
    }
}
