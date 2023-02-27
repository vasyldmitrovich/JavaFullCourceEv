package com.softserve.edu11.homework.task2;

import java.util.Scanner;

public class Solution {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // Enter a sentence that contains the words between more than one space.
        String text = getStringFromUser();
        // Convert all spaces, consecutive, one.
        System.out.println("Sentence after conversion of spaces:\n" + text.replaceAll(" +", " "));
    }

    public static String getStringFromUser() {
        System.out.println("Please enter a sentence with more than 2 spaces between words:");
        return scanner.nextLine();
    }
}
