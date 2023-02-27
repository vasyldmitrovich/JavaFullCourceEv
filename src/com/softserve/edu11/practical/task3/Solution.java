package com.softserve.edu11.practical.task3;

import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    private static int count;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        count = 1;
        while (count <= 5) {
            isCorrectName(compilePattern(getRegex()), getUsernameFromUser());
            ++count;
        }
    }

    public static String getRegex() {
        return "[\\w]{3,15}";
    }

    public static Pattern compilePattern(String regex) {
        return Pattern.compile(regex);
    }

    public static void isCorrectName(Pattern pattern, String name) {
        System.out.println("Is entered name enter according to the rule?");
        if (pattern.matcher(name).matches()) {
            System.out.println("YES\n");
        } else {
            System.out.println("NO\n");
        }
    }

    public static String getUsernameFromUser() {
        System.out.println("Please enter username #" + count + ":");
        return scanner.nextLine();
    }
}
