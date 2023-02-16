package com.softserve.edu09.practical;

import java.util.*;

public class Application {

    private static List<Integer> myCollection;
    private static List<Integer> modifiedCollection;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // Declare collection myCollection of 10 integers and fill it (from the console or random).
        myCollection = createMyCollection();
        // Find and save in list newCollection all positions of element more than 5 in the collection.
        // Print newCollection.
        createNewCollection();
        // Remove from collection myCollection elements, which are greater than 20.
        // Print result.
        createLess20Collection();
        // Insert elements 1, -3, -4 in positions 2, 8, 5.
        // Print result in the format: “position – xxx, value of element – xxx”.
        modifiedCollection = modifyMyCollection();
        // Sort and print collection.
        sortModifiedCollection(modifiedCollection);
    }

    public static List<Integer> createMyCollection() {
        List<Integer> list = new ArrayList<>(10);
        Collections.addAll(list, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        list.forEach(x -> list.set(list.indexOf(x), (int) (Math.random() * 101 - 50)));
        System.out.println("\nDisplay of my collection:\n" + list);
        return list;
    }

    public static void createNewCollection() {
        System.out.println("\nDisplay of new collection:\n" + myCollection.stream().filter(x -> (x > 5)).toList());
    }

    public static void createLess20Collection() {
        System.out.println("\nDisplay of \"Less 20\" collection:\n" + myCollection.stream().filter(x -> (x <= 20)).toList());
    }

    public static List<Integer> modifyMyCollection() {
        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);
        System.out.println("\nDisplay of modified collection in a row:\n" + myCollection);
        System.out.println("\nDisplay of modified collection element by element:");
        for (int i = 0; i < myCollection.size(); i++)
            System.out.printf("Position - %d, value of element - %d\n", i, myCollection.get(i));
        return myCollection;
    }

    public static void sortModifiedCollection(List<Integer> modifiedCollection) {
        Collections.sort(modifiedCollection);
        System.out.println("\nDisplay of sorted modified collection in ascending order:\n" + modifiedCollection);
        Collections.reverse(modifiedCollection);
        System.out.println("\nDisplay of sorted modified collection in descending order:\n" + modifiedCollection);
    }

}
