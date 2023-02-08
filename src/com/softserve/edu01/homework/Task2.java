package com.softserve.edu01.homework;

import java.util.Scanner;

public class Task2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
        scanner.close();
    }

    public static String getInfo() {
        return scanner.nextLine();
    }

    public static String getName() {
        return getInfo();
    }

    public static int getAge() {
        int age = 0;
        while (age <= 0) {
            try {
                age = Integer.parseInt(getInfo());
            } catch (NumberFormatException exception) {
                System.out.println("You input not Integer. Please try again input correct age!");
            }
            if (age < 0) {
                System.out.println("Age can not be negative!");
            }
            if (age == 0) {
                System.out.println("Please enter valid age");
            }
        }
        return age;
    }

    public static String getAddress() {
        return getInfo();
    }

    public static boolean isConfirmed() {
        return getInfo().equalsIgnoreCase("Yes");
    }

    public static void run() {
        while (true) {
            System.out.println("What is your name?");
            String name = getName();
            System.out.println("How old are you, " + name + "?");
            int age = getAge();
            System.out.println("Wow, " + name + " you are already " + age + " years old! Where do you live?");
            String address = getAddress();
            System.out.println("So, let's check the info: Your name is " + name + ", you are " + age +
                               " years old and you live in " + address + "! Correct?");
            boolean result = isConfirmed();
            if (result) {
                System.out.println("Thank you! Information confirmed!");
                break;
            } else {
                System.out.println("Let's check everything again!");
            }
        }
    }
}