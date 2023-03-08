package com.softserve.edu09.homeWork;

import java.util.ArrayList;
import java.util.List;

public class AppMyCollection10 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<Integer> numbers = new ArrayList<>();

        MyCollection10.toFill(numbers);
        System.out.println(numbers + " = 10 numbers.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        MyCollection10.swapMaxMin(numbers);
        System.out.println(numbers + " = swap max-min.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        MyCollection10.insertRandomNumber(numbers);
        System.out.println(numbers + " = insert random three-digit number.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        MyCollection10.insertZero(numbers);
        System.out.println(numbers + " = insert zero between all neighboring elements collection.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");


        System.out.println("k = 5");
        MyCollection10.twoLists(numbers, 5);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        MyCollection10.removeEven(numbers);
        System.out.println(numbers + " = delete last even number.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        MyCollection10.removeAfterMin(numbers);
        System.out.println(numbers + " =  delete number following the first minimum.");
    }
}
