package com.softserve.edu05.homework;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 101) - 50);
        }
        System.out.println("There is new array for 10 random integers [-50...+50]:\n"
                + Arrays.toString(array));
        for (int i = array.length / 2; i < array.length; i++) {
            if (array[i] < 0) {
                product *= array[i];
            }
        }

            for (int j = 0; j < array.length / 2; j++) {
                if (array[j] >= 0) {
                    sum += array[j];
                } else {
                    break;
                }
            }
        System.out.println((array[0]<0 || array[1]<0 || array[2]<0 || array[3]<0 || array[4]<0) ? product : sum);
        }
    }