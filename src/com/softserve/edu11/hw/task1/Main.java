package com.softserve.edu11.hw.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence of five words:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        String biggestWord = null;
        int max = 0;
        for (String temp: words) {
            if(temp.length() > max){
                max = temp.length();
                biggestWord = temp;
            }
        }
        System.out.println("Biggest word - " + biggestWord + ", it length = " + max);
        System.out.println(new StringBuilder(words[1]).reverse());
    }
}
