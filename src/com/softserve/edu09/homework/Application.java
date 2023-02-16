package com.softserve.edu09.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    private static List<Integer> myCollection;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // Declare collection myCollection of 10 integers and fill it (from the console or random).
        myCollection = createMyCollection();
        // Swap the maximum and minimum elements in the list.
        swapMaxAndMin();
        // Insert a random three-digit number before the first negative element of the list.
        insert3DigitNumber();
        // Insert a zero between all neighboring elements collection myCollection with different signs.
        insertZero();
        // Copy the first k elements of the myCollection to the list1, in direct order,
        // and the rest to the list2 in reverse order.
        doAnotherTask();
        // In a list myCollection remove the last even element (if there are even elements in the list).
        // If there is no such element, display a message.
        removeLastEven();
        // Remove from the list myCollection the element following the first minimum.
        // If the minimum element is the last one, nothing needs to be removed.
        removeAfterMinimum();
    }

    public static List<Integer> createMyCollection() {
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 101 - 50));
        }
        System.out.println("\nDisplay of my collection:\n" + list);
        return list;
    }

    public static void swapMaxAndMin() {
        int indexMin = myCollection.indexOf(myCollection.stream().min((i1, i2) -> (i1 - i2)).get());
        int indexMax = myCollection.indexOf(myCollection.stream().max((i1, i2) -> (i1 - i2)).get());
        // Just to show another method (not to jump into collection and search through "for each" loop)
        int min = Collections.min(myCollection, (i1,i2) -> (i1-i2));
        int max = Collections.max(myCollection, (i1,i2) -> (i1-i2));
        System.out.printf ("\nMin element - %d\nMax element - %d\n", min, max);
        //
        Collections.swap(myCollection, indexMin, indexMax);
        System.out.println("\nDisplay my collection with swapped min & max elements:\n" + myCollection);
    }

    public static void insert3DigitNumber() {
        int indexNegative = myCollection.indexOf(myCollection.stream().filter(x -> x<0).findFirst().get());
        System.out.println("\nFirst negative element index is - " + indexNegative);
        myCollection.add(indexNegative, (int) (Math.random()*900+100));
        System.out.println("Display my collection with insertion random 3digit number before first negative element:\n" + myCollection);
    }

    public static void insertZero() {
        for (int i = 0; i < myCollection.size()-1; i++) {
            if ((myCollection.get(i)>=0 && myCollection.get(i+1)<0)
                    || (myCollection.get(i)<=0 && myCollection.get(i+1)>=0)) {
                myCollection.add(i+1,0);
                i++;
            }
        }
        System.out.println("\nDisplay my collection with insertion 0 between each pair of elements with different signs:\n" + myCollection);
    }

    public static void doAnotherTask () {
        int k = myCollection.size()/2;
        List<Integer> list1 = myCollection.stream().limit(k).toList();
        System.out.println("\nDisplay list1:\n" + list1);
        List<Integer> list2 = myCollection.stream().skip(k).collect(Collectors.toCollection(ArrayList::new));
        Collections.reverse(list2);
        System.out.println("\nDisplay list2:\n" + list2);
    }

    public static void removeLastEven () {
        for (int i = myCollection.size()-1; i >= 0; i--) {
            if (myCollection.get(i)%2==0) {
                myCollection.remove(i);
                break;
            } else {
                System.out.println("There are any even numbers in a list");
            }
        }
        System.out.println("\nDisplay my collection without last even number:\n" + myCollection);
    }
    public static void removeAfterMinimum () {
        int indexMin = myCollection.indexOf(myCollection.stream().min((i1, i2) -> (i1 - i2)).get());
        if (indexMin < myCollection.size()-1)
            myCollection.remove(indexMin+1);
        System.out.printf ("\nMin element - %d", Collections.min(myCollection, (i1,i2) -> (i1-i2)));
        System.out.println("\nDisplay my collection without element next to minimum:\n" + myCollection);
    }
}
