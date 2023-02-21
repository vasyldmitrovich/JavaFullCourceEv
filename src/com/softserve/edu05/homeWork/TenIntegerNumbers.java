package com.softserve.edu05.homeWork;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TenIntegerNumbers {
    public static void main(String[] args) {
        int sumPositive = 0;
        int n;
        int product = 0;

        System.out.println("Enter 10 numbers: ");

        int[] array = new int[10];
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Input number: ");
            n = Integer.parseInt(console.nextLine());
            array[i] = n;

            if (n >= 0) {
                sumPositive = IntStream.of(0, 1, 2, 3, 4).map(j -> array[j]).sum();
            } else for (int l = 0; l < array.length; l++) {
                product = array[5] * array[6] * array[7] * array[8] * array[9];
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Sum 1 to 5 = " + sumPositive);
        System.out.println("Product 5 to 10 = " + product);
        console.close();

    }
}