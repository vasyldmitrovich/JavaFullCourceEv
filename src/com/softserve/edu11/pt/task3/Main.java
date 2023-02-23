package com.softserve.edu11.pt.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. Enter 5 user names:");
        String[] names = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
        for (String temp: names) {
            Main.test(temp);
        }
    }

    public static void test(String str){
        Pattern pattern = Pattern.compile("\\w{3,15}");
        Matcher matcher = pattern.matcher(str);
        if(matcher.matches()){
            System.out.println(str + " - test was positive");
        } else System.out.println(str + " - test was negative");
    }
}
