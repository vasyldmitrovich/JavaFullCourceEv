package com.softserve.edu05.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + "th number: ");
            arr[i] = scan.nextInt();
        }

        boolean isPositive = true;

        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                isPositive = false;
            }
        }

        if (isPositive) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += arr[i];
            }
            System.out.println("\nSum: " + sum);
        } else {
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product *= arr[i];
            }
            System.out.println("\nProduct: " + product);
        }
    }
}
