package com.softserve.edu08.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static ArrayList<Person> list = new ArrayList<>();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        addToList(new Student(new FullName("Yaroslav", "Tkachyk"), 31, 2) {
            @Override
            public String activity() {
                return "I study Java\n";
            }
        });
        addToList(new Student(new FullName("Elon", "Musk"), 51, 4) {
            @Override
            public String activity() {
                return "I'm a SpaceX CEO\n";
            }
        });
        addToList(new Student(new FullName("Original", "Student"), 18, 2 ));
        try {
            addToList((Person) list.get(2).clone());
        }
        catch (CloneNotSupportedException exception) {
            System.out.println("Houston we got a problem");
            exception.printStackTrace();
        }
        printList();
    }

    public static void addToList(Person person) {
        list.add(person);
    }

    public static void printList() {
        System.out.println("Here you get a list of all students:\n");
        for (Person student : list) {
            System.out.println(student.info() + student.activity());
        }
    }

    public static int getCourseNumber() {
        System.out.println("Enter the course number for dolly:");
        int number = 0;
        while (number < 1) {
            try {
            number = Integer.parseInt(new Scanner(System.in).nextLine());}
            catch (NumberFormatException e) {
                System.out.println("Please input Integer");
            }
            if (number < 1) {
                System.out.println("Input number > 0");
            }
        }
        return number;
    }
}
