package com.softserve.edu05.homework.task2;

import java.util.Arrays;

public class Task2 {

       private static final int[] array = new int[10];
        private static int sum = 0;
        private static int product = 1;
        private static int min = Integer.MAX_VALUE;
        public static void fillArray () {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) ((Math.random() * 51) - 25);
            }
            System.out.println("There is new array for 10 random integers in range of [-25...+25]:\n"
                    + Arrays.toString(array));
        }
        public static void getProductLast5 () {
            for (int i = array.length / 2; i < array.length; i++) {
                product *= array[i];
            }
        }

    public static void getSumFirst5() {
        for (int j = 0; j < array.length / 2; j++) {
            if (array[j] < min) {
                min = array[j];
            }
            if (array[j] >= 0) {
                sum += array[j];
            } else {
                break;
            }
        }
    }
    public static void printResult () {
        System.out.println(min<0?product:sum);
        }
    }