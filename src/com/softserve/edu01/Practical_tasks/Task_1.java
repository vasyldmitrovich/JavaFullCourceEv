package com.softserve.edu01.Practical_tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        float a = scan.nextInt();

        System.out.print("Enter b: ");
        float b = scan.nextInt();

        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + a * b);
        System.out.println("a / b: " + a / b);
    }
}
