package com.softserve.edu13.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<Integer> list = Arrays.asList(12,25,16,52,49,37,98,64,73,81);
        int[] arr = {12,25,16,52,49,37,98,64,73,81};
        System.out.println(count(list, ((a, list1) -> a < IntStream.of(arr).sum()/arr.length)));
    }

    public static int count(List<Integer> list, MyInterface my) {
        int result = 0;
        for (Integer tmp: list) {
            if(my.method(tmp, list)) result++;
        }
        return result;
    }
}

@FunctionalInterface
interface MyInterface {
    boolean method(int a, List<Integer> list);
}
