package com.softserve.edu11.homeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main11 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
   /*     Scanner console = new Scanner(System.in);
        System.out.println("Enter in the console sentence of five words: ");
        String sentence = console.nextLine();
        String[] sentenceWords = sentence.split(" ");
        String longWord = " ";
        String secondLongWord = " ";

        for (String temp : sentenceWords)
            if (temp.length() > longWord.length()) {
                secondLongWord = longWord;
                longWord = temp;
            } else if (temp.length() > secondLongWord.length()) {
                secondLongWord = temp;
            }

        System.out.println("Longest word is - " + longWord);
        System.out.println("Determine the number of its letters - " + longWord.length());

        System.out.println("bring the second word in reverse order: ");
        for (int i = secondLongWord.length() - 1; i >= 0; i--) {
            System.out.print(secondLongWord.charAt(i));
        }
*/

// Part II
       /* Scanner consoleTwo = new Scanner(System.in);
        System.out.println("Enter a sentence that contains the words between more than one space.");
        String sentenceSpace  = consoleTwo.nextLine();
        String[] sentenceWords = sentenceSpace.split("\\s+");
        for (String temp: sentenceWords) {
            System.out.print(temp + " ");
        }
*/

        // Part III
        Scanner consoleThree= new Scanner(System.in);
        System.out.println("Enter the text that contains several occurrences of US" +
                " currency (the first symbol \"$\", then any number of digits, dot " +
                "(example - text $5555.56454)): ");
        String text = consoleThree.nextLine();
        Main11.found(text);
    }

    public static void found(String str){
        Pattern pattern = Pattern.compile("\\$(\\d*)\\.(\\d{2})");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group() + " ");
        }

    }
}
