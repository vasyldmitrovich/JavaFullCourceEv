package com.softserve.edu14.practacalTasks.task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("List: " + primes);

        IntSummaryStatistics stats = primes.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println("\nCount: " + stats.getCount());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("\nSum: " + stats.getSum());

//        // The second way to get sum
//        int sum = primes.stream().reduce(0, (a, b) -> a += b);
//        System.out.println("\nSum: " + sum);
    }
}
