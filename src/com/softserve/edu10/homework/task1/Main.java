package com.softserve.edu10.homework.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        fillSet(set1);
        fillSet(set2);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> set3 = unionSet(set1, set2);

        System.out.println("\nSet1 U Set2: " + set3);

        Set<Integer> set4 = intersectSet(set1, set2);

        System.out.println("Set1 ∩ Set2: " + set4);
    }

    public static void fillSet(Set<Integer> set){
        for(int i = 0; i < 5; i++) {
            set.add((int) (Math.random() * 7));
        }
    }

    public static Set<Integer> unionSet(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersectSet(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> copySet1 = new HashSet<>(set1);
        copySet1.retainAll(set2);
        return copySet1;
    }
}
