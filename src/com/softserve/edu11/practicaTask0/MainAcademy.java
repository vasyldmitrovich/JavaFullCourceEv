package com.softserve.edu11.practicaTask0;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainAcademy {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = console.nextLine();
        System.out.print("Enter second string: ");
        String second = console.nextLine();

        boolean result = false;
        for (int i = 0; i < (second.length() - first.length()); i++) {
            result = first.regionMatches(0, second, i, first.length());
            if (result) break;
        }
        System.out.println("The first variable substrings second variable  - " + result);

    /// Part II

        Scanner consoleTwo = new Scanner(System.in);
        System.out.print("Enter surname, name and patronymic: ");
        String enterString = consoleTwo.nextLine();
        String[] person = enterString.split(" ");
        System.out.println(person[0] + " " + person[1].charAt(0) + " " + person[2].charAt(0));
        System.out.println(person[1]);
        System.out.println(person[1] + " " + person[2] + " " + person[0]);


//              Part III

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name can in 3 to 15 characters of the Latin alphabet, numbers, and underscores. Enter 5 user names:");
        String[] names = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
        for (String temp: names) {
            MainAcademy.test(temp);
        }
    }

    public static void test(String str){
        Pattern pattern;
        pattern = Pattern.compile("\\w{3,15}");
        Matcher matcher = pattern.matcher(str);
        if(matcher.matches()){
            System.out.println(str + " - user name validity");
        } else System.out.println(str + " - user name  don`t validity.");

    }
}
