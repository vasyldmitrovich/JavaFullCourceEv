package com.softserve.edu17teamWork;

public class Task6 {
    public static void run(String text){
        if(text.equals("")){
            System.out.println("Number of words: " + 0);
        } else {
            String[] words = text.split(" ");
            System.out.println("Number of words: " + words.length);
        }
    }
}
