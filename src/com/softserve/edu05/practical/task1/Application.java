package com.softserve.edu05.practical.task1;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // Create new array for 10 integers
        int[] array = new int[10];
        // Fill the array with 9 random integers in range [-1000 ... 1000]
        // Last index i would like not to fill, to get default value 0;
        for (int i = 0; i < array.length-1; i++) {
            array[i] = (int) (Math.random() * 2001) - 1000;
        }
        // Display created array with random integers
        System.out.println("\nOur random array for 10 integers is - " + Arrays.toString(array));
        // Display first task - max value from array
        System.out.println("*** \nMaximum value in array - is value " + Task1.max(array));
        // Display second task - sum of positive integers from array
        System.out.println("*** \nSum of positive integers in array is - " + Task1.sumPositive(array));
        // Display second task - amount of negative integers from array
        System.out.println("*** \nAmount of negative integers in array is - " + Task1.amountNegative(array));
        /* Run void method - to display the result of last task
        define what values (positive or negative) array contains more */
        Task1.whatValuesAreMore(array);
    }
}
