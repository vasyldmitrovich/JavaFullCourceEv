package com.softserve.edu09.practicalTask;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new LinkedList<>();

        ListExtra.fill(myCollection, 10);
        System.out.println("My collection: " + myCollection);

        List<Integer> newCollection = myCollection.subList(5, myCollection.size());
        System.out.println("\nNew collection: " + newCollection);

        ListExtra.deleteMoreThan(myCollection, 20);
        System.out.println("\nMy collection, but numbers less than 20: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(5, -3);
        myCollection.add(8, -4);

        Collections.sort(myCollection);
        ListExtra.input(myCollection);
    }
}
