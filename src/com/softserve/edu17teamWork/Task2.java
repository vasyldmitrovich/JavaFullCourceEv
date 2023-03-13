package com.softserve.edu17teamWork;

import java.util.HashSet;
import java.util.Set;

public class Task2 {

    public static void run(int a){
        System.out.println("almost an answer - " + getAllFactorsVer1(a));
    }

    static Set<Integer> getAllFactorsVer1(int n) {
        Set<Integer> factors = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}