package com.softserve.edu14.practical.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        // calculate count, min, max, sum, for numbers and print all results
        System.out.println("\nQuantity of Integers is " + primes.size());
        // System.out.println("\nQuantity of Integers is " + primes.stream().count());
        System.out.println("\nMinimum element among Integers is "
                + primes.stream().min(Comparator.comparingInt(element -> element)).get());
        // System.out.println("\nMinimum among Integers is " + primes.stream().min((el1,el2) -> (el1-el2).get());
        System.out.println("\nMaximum element among Integers is "
                + primes.stream().max(Comparator.comparingInt(element -> element)).get());
        // System.out.println("\nMaximum among Integers is " + primes.stream().max((el1,el2) -> el1-el2).get());
        System.out.println("\nSum of all Integers of the list is "
                + primes.stream().reduce(0, Integer::sum));

        System.out.println("----------------------------------------------------------------------");

        IntSummaryStatistics stats = primes.stream().mapToInt(element -> element).summaryStatistics();
        System.out.println("\nQuantity of Integers is " + stats.getCount());
        System.out.println("\nMinimum element among Integers is " + stats.getMin());
        System.out.println("\nMaximum element among Integers is " + stats.getMax());
        System.out.println("\nSum of all Integers of the list is " + stats.getSum());
    }
}
