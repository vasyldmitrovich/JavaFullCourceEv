package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Main.toFill(set1);
        Main.toFill(set2);
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("union = " + new Method<Integer>().union(set1, set2));
        System.out.println("intersect = " + new Method<Integer>().intersect(set1, set2));

    }

    public static void toFill(Set set){
        for (int i = 0; i < 7; i++) {
            set.add((int)(Math.random()*10));
        }
    }
}
