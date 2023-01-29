package com.softserve.edu04.homework.task1;

import java.util.Scanner;

public class Task1_2 {

    public static void main(String[] args) {
        maxAndMin();
    }

    public static void maxAndMin () {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (i < 3) {
                int x = scanner.nextInt();
                if (x > max ) {
                    max = x;
                }
                if (x < min) {
                    min = x;
                }
                i++;
            }
        System.out.println("Maximum value is - " + max + "\nMinimum value is - " + min);
    }
}