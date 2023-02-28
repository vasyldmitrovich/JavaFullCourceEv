package com.softserve.edu11.practicalTasks.task1;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String pattern = getString("pattern");
        String text = getString("text");

        checkPattern(pattern, text);
    }

    public static String getString(String str){
        System.out.print("Enter the " + str + ": ");
        return scanner.nextLine();
    }

    public static void checkPattern(String pattern, String text){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        boolean isPattern = false;
        while(m.find()){
            isPattern = true;
        }

        if(isPattern){
            System.out.println("The text substring the pattern");
        } else {
            System.out.println("The text doesn't substring the pattern");
        }
    }
}
