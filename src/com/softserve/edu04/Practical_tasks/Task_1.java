package com.softserve.edu04.Practical_tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[] num = new int[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            num[i] = scan.nextInt();
        }

        int counter = 0;

        for (int i = 0; i < 3; i++) {
            if (num[i] % 2 != 0)
                counter++;
        }

        System.out.println("\nNumber of odd numbers: " + counter);
    }
}
