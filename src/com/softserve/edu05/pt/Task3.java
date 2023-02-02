package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value namber " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int x = 0, y = 0, min = arr[0], product = 1;
        for (int i = 0; i < 5; i++) {
            if(arr[i] > 0) x += 1;
            if(x == 2) System.out.println("Index of second positive number in array = " + i);
        }
        for (int i = 0; i < 5; i++) {
            if(min > arr[i]) {
                min = arr[i];
                y = i;
            }
            if(arr[i]%2 == 0) product *= arr[i];
        }
        System.out.println("Minimum number in array = " + min + "; it index = " + y);
        System.out.println("Product of all even numbers in array = " + product);
    }
}
