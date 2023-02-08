package com.softserve.edu04.practicalTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            nums[i] = scan.nextInt();
        }

        int counter = 0;

        for (int i = 0; i < 3; i++) {
            if (nums[i] % 2 != 0) {
                counter++;
            }
        }

        System.out.println("\nNumber of odd numbers: " + counter);
    }
}
