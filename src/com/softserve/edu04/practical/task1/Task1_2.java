package com.softserve.edu04.practical.task1;

import java.util.Arrays;

public class Task1_2 {
    public static void main(String[] args) {
        int[] array = new int[40]; // You may place any quantity of numbers you want to read from console
        for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (Math.random()*99)+1; // generate random number from [1 to 99]
            }
        System.out.println("\nTotal scanned numbers is - " + array.length);
        System.out.println("\nArray was filled with 40 random numbers in range [1 ... 99] \n" + Arrays.toString(array));
        System.out.println("\nTotal quantity of odd numbers among all scanned numbers is - " + oddQuantity(array));
    }


    public static int oddQuantity(int[] numbers) {
        int quantity = 0;
        for (int number : numbers) {
            if (number % 2 == 1) {
                quantity++;
            }
        }
        return quantity;
    }

}
