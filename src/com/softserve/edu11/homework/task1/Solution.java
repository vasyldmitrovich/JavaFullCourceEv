package com.softserve.edu11.homework.task1;

import java.util.Scanner;

public class Solution {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // Enter in the console sentence of five words.
        String text = getStringFromUser();
        // Enter in the console sentence of five words.
        DisplayLongestWord(text);
        // determine the number of its letters.
        DisplayLengthOfLongestWord(text);
        // bring the second word in reverse order
        ReverseOrder(text, 2);
    }

    public static String getStringFromUser() {
        System.out.println("Please enter a sentence of 5 words:");
        return scanner.nextLine();
    }

    public static void DisplayLongestWord(String string) {
        String[] array = string.split(" ");
        int max = 0;
        String longest = "";
        for (String word : array) {
            if (word.length() > max) {
                max = word.length();
                longest = word;
            }
        }
        System.out.println("The longest word of the sentence is: " + longest);
    }

    public static void DisplayLengthOfLongestWord(String string) {
        String[] array = string.split(" ");
        int max = 0;
        for (String word : array) {
            if (word.length() > max) {
                max = word.length();
            }
        }
        System.out.println("The length of longest word of the sentence is: " + max + " characters");
    }

    public static void ReverseOrder(String string, int wordNumber) {
        String[] array = string.split(" ");
        if (wordNumber < array.length) {
            StringBuilder word = new StringBuilder(array[wordNumber - 1]);
            System.out.println("The reverse version of word #" + wordNumber + " is: " + word.reverse());
        } else {
            System.out.println("There is no word #" + wordNumber + " in entered sentence");
        }
    }
}
