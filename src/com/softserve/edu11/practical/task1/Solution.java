package com.softserve.edu11.practical.task1;

import java.util.Scanner;

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    private static String string1 = "Manchester";
    private static String string2 = "Manchester United won the Carabao Cup";
    private static String string3 = "Manchester city";

    public static void main(String[] args) {
        run();
    }
    public static void run() {
        option1();
        option2();
    }

    public static void option1() {
        System.out.println("Enter first string:");
        String string1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String string2 = scanner.nextLine();
        System.out.println("First string substring second?\n" + string2.contains(string1));
    }

    public static void option2() {
        // Determine whether the first variable substring second.
        boolean result1 = string2.contains(string1);
        boolean result2 = string2.contains(string3);
        boolean result3 = string2.contains(string3.substring(0,10));
        boolean result4 = string2.startsWith(string1);
        boolean result5 = string1.contentEquals(string3.substring(0,10));
        System.out.println("\n\nРядок 2 містить в собі рядок 1: " + result1);
        System.out.println("Рядок 2 містить в собі рядок 3: " + result2);
        System.out.println("Рядок 2 містить в собі рядок 3(супність перших 10 символів): " + result3);
        System.out.println("Рядок 2 розпочинається з рядка 1: " + result4);
        System.out.println("Рядок 1 ідентичний рядку 3(супність перших 10 символів): " + result5);
    }
}
