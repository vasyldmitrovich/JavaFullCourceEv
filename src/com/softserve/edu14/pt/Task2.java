package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println(primes);
        System.out.println("count = " + primes.stream().count());
        System.out.println("min = " + primes.stream().min(Comparator.comparingInt(a -> a)).get());
        System.out.println("max = " + primes.stream().max(Comparator.comparingInt(a -> a)).get());
        System.out.println("sum = " + primes.stream().reduce(0, (a, b) -> a + b));
    }
}
