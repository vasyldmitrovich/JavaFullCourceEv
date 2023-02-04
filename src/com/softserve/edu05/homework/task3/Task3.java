package com.softserve.edu05.homework.task3;

import java.util.Arrays;

public class Task3 {
    private static final int[] array = new int[5];
    private static int variable;
    private static int product = 1;

    public static void fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 51) - 25);
        }
        System.out.println("There is new array for 10 random integers in range of [-25...+25]:\n"
                + Arrays.toString(array));
    }

    public static int getIndex() {
        variable = 2;
        int count = 0;
        int j = -1;
        for (int i = 0; i < array.length && count != variable; i++) {
            if (array[i] >= 0) {
                j = i;
                ++count;
            }
            if (count < variable) {
                j = -1;
            }
        }
        return j;
    }

    public static void message() {
        if (getIndex() < 0) {
            System.out.println("There is no " + variable + " positive numbers in this array");
        }
    }

    public static void getMinValueAndPosition() {
        int min = Integer.MAX_VALUE;
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                position = i;
            }
        }
        System.out.println("Minimal value in this array is - (" + min +
                "). It has position # " + position + " in this array.");
    }

    public static int getProductOfEvenValues() {
        for (int x : array) {
            if (x % 2 == 0) {
                product *= x;
            }
        }
        return product;
    }
}
