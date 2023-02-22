package com.softserve.edu09.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new LinkedList<>();

        ListExtra.fill(myCollection, 10);
        System.out.println("\nMy collection: " + myCollection);

        ListExtra.swapMaxAndMin(myCollection);
        System.out.println("My collection after swap max and min: " + myCollection);

        ListExtra.insertBeforeNegative(myCollection);
        System.out.println("\nMy collection after insert 3 digit number: " + myCollection);

        ListExtra.insertZero(myCollection);
        System.out.println("My collection after insert zero: " + myCollection);

        ListExtra.splitList(myCollection, 7);

        ListExtra.removeLastEven(myCollection);

        ListExtra.removeAfterMin(myCollection);
        System.out.println("My collection after remove after min: " + myCollection);
    }
}
