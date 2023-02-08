package com.softserve.edu05.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter the number of month: ");
        int numOfMonth = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (numOfMonth - 1 == i)
                System.out.println("This month has " + arr[i] + " days");
        }
    }
}
