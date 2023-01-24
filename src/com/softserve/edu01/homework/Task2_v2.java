package com.softserve.edu01.homework;

import java.util.Scanner;

public class Task2_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is your name?");
            String name = scanner.next();
            System.out.println("How old are you, " + name + "?");
            int age = scanner.nextInt();
            System.out.println("Wow, " + name + " you are already " + age + " years old! Where do you live?");
            String address = scanner.next();
            System.out.println("So, let's check the info: Your name is " + name + ", you are " + age + " years old and you live in " + address + "! Correct?");
            String confirmation = scanner.next();
            if (confirmation.equalsIgnoreCase("Yes")) {
                System.out.println("Thank you! Information confirmed!");
                break;
            } else {
                System.out.println("Let's check everything again!");
            }
        }
    }
}

