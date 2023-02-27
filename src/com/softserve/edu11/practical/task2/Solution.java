package com.softserve.edu11.practical.task2;

import java.util.Scanner;

public class Solution {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String surname = getSurname();
        String name = getName();
        String patronymic = getPatronymic();
        if (name.length()>0 && surname.length()>0 && patronymic.length() >0) {
            // Output on the console: surnames and initials
            System.out.println(surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".");
            // Output on the console: name
            System.out.println(name);
            // Output on the console: name, middle name and last name
            System.out.println(name + " " + patronymic + " " + surname);
        } else {
            System.out.println("You have entered empty value");
        }
    }

    public static String getSurname() {
        System.out.println("Enter your surname:");
        return scanner.nextLine();
    }

    public static String getName() {
        System.out.println("Enter your name:");
        return scanner.nextLine();
    }

    public static String getPatronymic() {
        System.out.println("Enter your patronymic:");
        return scanner.nextLine();
    }
}

