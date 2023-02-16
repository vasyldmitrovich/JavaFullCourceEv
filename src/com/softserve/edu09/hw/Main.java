package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        Solve.toFill(myCollection);
        System.out.println(myCollection + " = myCollection");
        System.out.println("-------------------------------");

        Solve.swapMaxMin(myCollection);
        System.out.println(myCollection + " = myCollection after swap max-min");
        System.out.println("-------------------------------");

        Solve.insertRandomNumber(myCollection);
        System.out.println(myCollection + " = myCollection after insert a random number");
        System.out.println("-------------------------------");

        Solve.insertZero(myCollection);
        System.out.println(myCollection + " = myCollection after insert a zero between all neighboring elements collection with different signs");
        System.out.println("-------------------------------");

        // let's say k equals 5
        System.out.println("k = 5");
        Solve.twoLists(myCollection, 5);
        System.out.println("-------------------------------");

        Solve.removeEven(myCollection);
        System.out.println(myCollection + " = myCollection after removing the last even number");
        System.out.println("-------------------------------");

        Solve.removeAfterMin(myCollection);
        System.out.println(myCollection + " = myCollection after removing number following the first minimum");
    }
}
