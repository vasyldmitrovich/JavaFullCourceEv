package com.softserve.edu14.practical.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        // Print how many empty strings are in this list
        System.out.println("\nQuantity of empty strings is " + list.stream().filter(element -> element.length()<1).count());
        //  Remove all empty Strings from list and print the result
        System.out.println("\nHere we got all non-empty strings from the list:");
        list.stream().filter(element -> element.length()>=1).forEach(System.out::println);
        // Convert String to uppercase and Join them with coma. Print the result
        String text = list.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println("\nHere we got all strings joined in 1 string using delimiter \",\":\n" + text);
    }
}
