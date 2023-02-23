package com.softserve.edu10.homework.task1;

import java.util.*;

public class Application {
    private static final Set <String> dogBreed = new HashSet<>();
    private static final Set <String> catBreed = new HashSet<>();
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        fillSets();
        System.out.println("Print original sets:");
        printSets();
        union(catBreed,dogBreed); // no double "Toyger" and "Malinois" inside!
        intersect(catBreed,dogBreed); // only "Toyger" and "Malinois" remain in set!
    }
    public static void fillSets () {
        dogBreed.add("Sealyham Terrier");
        dogBreed.add("Komondor");
        dogBreed.add("Malinois");
        dogBreed.add("Cairn");
        dogBreed.add("Great Dane");
        dogBreed.add("Toyger"); // same element as in catBreed Set

        catBreed.add("Chausie");
        catBreed.add("Aegean");
        catBreed.add("Colorpoint Persian");
        catBreed.add("Peterbald");
        catBreed.add("Toyger");
        catBreed.add("Malinois"); // same element as in dogBreed Set
    }

    public static void printSets () {
        System.out.println("\nSet of dog breeds:\n" + dogBreed);
        System.out.println("\nSet of cat breeds:\n" + catBreed);
    }

    public static void union(Set set1, Set set2){
        Set <String> set3 = new HashSet<>(set1); // create a copy of set1
        set3.addAll(set2);
        Set<String> unionSet = set3;
        System.out.println("\n***\nPrint result of realizing the union operation of two sets:\n" + unionSet);
        System.out.println("Due to this method - set1 will receive all elements of set2 that are not present in set1");
    }

    public static void intersect (Set set1, Set set2) {
        set1.retainAll(set2);
        Set<String> intersectSet = set1;
        System.out.println("\n***\nPrint result of realizing the intersection operation of two sets:\n" + intersectSet);
        System.out.println("Due to this method - set1 will remain only with elements which are similar to elements of set2");
    }
}