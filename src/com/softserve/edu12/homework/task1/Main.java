package com.softserve.edu12.homework.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            int a = getNumber("a");
            int b = getNumber("b");
            div(a, b);
        } catch (InputMismatchException e){
            System.out.println("You have written the wrong type :/");
        } catch (ArithmeticException e){
            System.out.println("We can't divide by zero :/");
        }
    }

    public static int getNumber(String text) throws InputMismatchException {
        System.out.print("Enter the " + text + ": ");
        return scanner.nextInt();
    }
    public static void div(int a, int b) throws ArithmeticException{
        System.out.println("a / b = " + a / b);
    }
}
