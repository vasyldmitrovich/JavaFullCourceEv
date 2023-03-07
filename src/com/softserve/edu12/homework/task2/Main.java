package com.softserve.edu12.homework.task2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        fillArray(list, 10, 1, 100);
        System.out.println("\nList: " + list);
    }

    public static void fillArray(ArrayList<Integer> list, int n, int min, int max){
        for(int i = 0; i < n; i++) {
            try {
                System.out.print("Enter the " + (i + 1) + "th value: ");
                int value = scanner.nextInt();

                if (min < value && value < max) {
                    list.add(value);
                } else {
                    System.out.println("wrong input...");
                    i--;
                }
            } catch (InputMismatchException e){
                System.out.println("wrong type...");
                scanner.next();
                i--;
            }
        }
    }
}
