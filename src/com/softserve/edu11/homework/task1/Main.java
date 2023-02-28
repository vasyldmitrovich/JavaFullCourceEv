package com.softserve.edu11.homework.task1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence = getSentence();

        String longestWord = getLongestWord(sentence);
        System.out.println("Number of letters in this word: " + longestWord.length());

        printSecondReverseWord(sentence);
    }

    public static String getSentence(){
        System.out.print("Enter the sentence of five worlds: ");
        return scanner.nextLine();
    }

    public static String getLongestWord(String sentence){
        String[] sentences = sentence.split(" ");

        String longestWord = sentences[0];
        for(String str : sentences){
            if(longestWord.length() < str.length()){
                longestWord = str;
            }
        }

        return longestWord;
    }

    public static void printSecondReverseWord(String sentence){
        String[] sentences = sentence.split(" ");
        StringBuilder word = new StringBuilder(sentences[1]);

        System.out.println("The second reversed word: " + word.reverse());
    }
}
