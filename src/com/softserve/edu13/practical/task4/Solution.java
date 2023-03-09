package com.softserve.edu13.practical.task4;

import java.util.Arrays;
import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Integer[] numbers = new Integer[10];
        System.out.println("Array of Integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 99 + 1);
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\nQuantity of Integers - " + numbers.length);
        Predicate<Integer> less50 = integer -> integer < 50;
        System.out.println("Quantity of Integers - that satisfy a predicate condition - " + count(numbers, less50));
        System.out.println();
        System.out.println("Same logic:");
        System.out.println("Quantity of Integers - that satisfy a predicate condition - " +
                Arrays.stream(numbers).filter(element -> element < 50).count());
        System.out.println("Those Integers are: ");
        Arrays.stream(numbers).filter(element -> element < 50).forEach(System.out::println);
    }

    public static int count(Integer[] array, Predicate<Integer> predicate) {
        int quantity = 0;
        for (Integer element : array) {
            if (predicate.test(element)) {
                quantity++;
            }
        }
        return quantity;
    }
}
