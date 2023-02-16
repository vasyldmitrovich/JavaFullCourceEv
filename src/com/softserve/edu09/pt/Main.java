package com.softserve.edu09.pt;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new LinkedList<>();
        new Solve().toFill(myCollection);
        System.out.println(myCollection + " = myCollection");

        System.out.println("=================================");

        List<Integer> newCollection = myCollection.subList(5, myCollection.size());
        System.out.println(newCollection + " = newCollection");

        System.out.println("=================================");

        new Solve().removeGreaterThen20(myCollection);
        System.out.println(myCollection + " = myCollection without numbers greater then 20");

        System.out.println("=================================");

        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);
        new Solve().onScreen(myCollection);

        System.out.println("=================================");

        myCollection.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(myCollection + " = sorted myCollection");
    }
}
