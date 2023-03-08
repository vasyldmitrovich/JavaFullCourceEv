package com.softserve.edu13.practicalTasks.task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(-4, -3, -2, -1, 0, 1, 2, 3, 4);
        System.out.println("\nList of numbers: " + listOfNumbers);

        int numberOfZeros = count(listOfNumbers, new Main.MyInterface() {
            @Override
            public boolean test(int x) {
                return x == 0;
            }
        });

        System.out.println("Numbers of zeros in the list: " + numberOfZeros);

        int numberOfNegativeNumbers = count(listOfNumbers, Main::negativeNumberCheck);
        System.out.println("Number of negative numbers in list: " + numberOfNegativeNumbers);

        int numberOfPositiveNumbers = count(listOfNumbers, x -> x >= 0);
        System.out.println("Number of positive numbers in list: " + numberOfPositiveNumbers);
    }

    @FunctionalInterface
    interface MyInterface {
        boolean test(int x);
    }

    public static int count(List<Integer> list, MyInterface myInterface) {
        int counter = 0;
        for (Integer value : list) {
            if (myInterface.test(value)) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean negativeNumberCheck(int x) {
        return x < 0;
    }
}
