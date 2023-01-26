package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey! \nEnter first value: ");
        int a = scanner.nextInt();
        System.out.print("Enter second value: ");
        int b = scanner.nextInt();
        System.out.println("a+b= " + (a + b) + "\na-b= " + (a - b) + "\na*b= " + (a * b));
        if(b!=0) {
            System.out.println("a/b= "+ (a / b));
        } else {
            System.out.println("b = 0, divide by zero is not allowed!");
        }
    }
}