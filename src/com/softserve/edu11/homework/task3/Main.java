package com.softserve.edu11.homework.task3;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String text = getText();
        checkDollars(text);
    }

    public static String getText(){
        System.out.print("Enter the text with currency ($) : ");
        return scanner.nextLine();
    }

    public static void checkDollars(String text){
        Pattern pattern = Pattern.compile("\\B\\$[0-9]+\\.[0-9]{2}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()) + " is correct currency");
        }
    }
}
