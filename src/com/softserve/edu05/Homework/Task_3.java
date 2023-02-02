package com.softserve.edu05.Homework;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter " + (i + 1) + "th number: ");
            arr[i] = scan.nextInt();
        }

        int positive_position = 2;
        int second_positive_num = -1;

        for (int i : arr) {
            if (0 <= i) {
                positive_position--;
                if (positive_position == 0) {
                    second_positive_num = i;
                    break;
                }
            }
        }

        if(second_positive_num != -1)
            System.out.println("\nThe second positive number: " + second_positive_num);
        else
            System.out.println("\nThis array has not two positive numbers");

        // Min search

        int min = arr[0];
        int min_index = 0;

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                min_index = i;
            }
        }

        System.out.println("\nMin: " + min);
        System.out.println("Min index: " + min_index);

        int product = 1;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= 0)
                product *= arr[i];
        }

        System.out.println("\nProduct even numbers: " + product);
    }
}
