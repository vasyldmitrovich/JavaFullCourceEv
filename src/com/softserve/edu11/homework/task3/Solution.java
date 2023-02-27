package com.softserve.edu11.homework.task3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // Implement a pattern for US currency
        // the first symbol "$", then any number of digits, dot and two digits after the dot.
        String regex = getRegex();
        // Enter the text from the console that contains several occurrences of US currency.
        String[] text = getTextFromUser();
        // Display all occurrences on the screen
        DisplayCorrectInput(compilePattern(regex), text);
    }

    public static String[] getTextFromUser() {
        System.out.println("Please enter the text that contains several occurrences of US currency:");
        return scanner.nextLine().split(" ");
    }

    public static String getRegex() {
        return "[$]{1}[0-9]+[.]{1}[0-9]{2}";
    }

    public static Pattern compilePattern(String regex) {
        return Pattern.compile(regex);
    }

    public static void DisplayCorrectInput(Pattern pattern, String[] text) {
        for (String element : text) {
            if (pattern.matcher(element).matches()) {
                System.out.println(element);
            }
        }
    }
}
