package com.softserve.edu11.practicalTasks.task2;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String text = getString("surname, name, patronymic");
        String[] strings = text.split(" ");

        print1(strings);
        print2(strings);
        print3(strings);
    }

    public static String getString(String text){
        System.out.print("Enter the " + text + ": ");
        return scanner.nextLine();
    }

    public static void print1(String[] strings){
        System.out.println("Surname and initials: " + strings[1] + " " + strings[0].charAt(0) + " " + strings[2].charAt(0));
    }

    public static void print2(String[] strings){
        System.out.println("Name: " + strings[0]);
    }

    public static void print3(String[] strings){
        System.out.println("Name, middle name and last name: " + strings[0] + " " + strings[2] + " " + strings[1]);
    }
}
