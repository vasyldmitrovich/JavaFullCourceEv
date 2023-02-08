package com.softserve.edu05.Homework;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + "th number: ");
            arr[i] = scan.nextInt();
        }

        int positivePosition = 2;
        int secondPositiveNum = -1;

        for (int i : arr) {
            if (0 <= i) {
                positivePosition--;
                if (positivePosition == 0) {
                    secondPositiveNum = i;
                    break;
                }
            }
        }

        if (secondPositiveNum != -1) {
            System.out.println("\nThe second positive number: " + secondPositiveNum);
        } else {
            System.out.println("\nThis array has not two positive numbers");
        }

        // Min search

        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("\nMin: " + min);
        System.out.println("Min index: " + minIndex);

        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= 0) {
                product *= arr[i];
            }
        }

        System.out.println("\nProduct even numbers: " + product);
    }
}
