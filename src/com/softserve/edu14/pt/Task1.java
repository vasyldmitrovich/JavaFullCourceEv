package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        int first = (int) list.stream().filter(x -> x.length() == 0).count();
        System.out.println("how many empty strings are in this list : " + first);

        list = list.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println(list + " after remove isEmpty");

        System.out.println(list.stream().reduce((x1, x2) -> x1.toUpperCase() + "," + x2.toUpperCase()));
    }
}
