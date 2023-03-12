package com.softserve.edu10.homeWork.hw1;

import java.util.HashSet;
import java.util.Set;

public class MainUnion {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        MainUnion.toFill(set1);
        MainUnion.toFill(set2);
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("union = " + new MethodsUnion<Integer>().union(set1, set2));
        System.out.println("intersect = " + new MethodsUnion<Integer>().intersect(set1, set2));

    }

    public static void toFill(Set set) {
        for (int i = 0; i < 7; i++) {
            set.add((int) (Math.random() * 10));
        }

    }
}
