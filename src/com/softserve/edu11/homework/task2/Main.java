package com.softserve.edu11.homework.task2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence = getSentence();
        eraseExtraSpaces(sentence);
    }

    public static String getSentence(){
        System.out.print("Enter the sentence: ");
        return scanner.nextLine();
    }

    public static void eraseExtraSpaces(String sentence){
        System.out.print("Sentence after erase extra spaces: " + sentence.replaceAll(" +", " "));
    }
}
