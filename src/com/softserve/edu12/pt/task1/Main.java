package com.softserve.edu12.pt.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        run();

    }
    public static void run() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first side: ");
        try {
            int a = scan.nextInt();
            System.out.print("Enter second side: ");
            int b = scan.nextInt();
            System.out.println("Area = " + squareRectangle(a, b));
        } catch (InputMismatchException e){
            System.err.println("\nYou must enter values!");
            Thread.sleep(1500);
            run();
        }

    }

    public static int squareRectangle (int a, int b){
        int c = 0;
        try {
            if(a < 0 || b < 0) throw new Exception();
            c = a * b;
        }
        catch (Exception o){
            System.err.println("you can't enter negative values");
        }
        return c;
    }
}
