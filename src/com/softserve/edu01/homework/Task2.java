package com.softserve.edu01.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {
    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static int getAge() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String getAddress() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String checkInfo() {
        String reply = "";
        try (InputStream input = System.in;
             InputStreamReader reader = new InputStreamReader(input);
             BufferedReader buffer = new BufferedReader(reader)) {
            reply = buffer.readLine();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return reply;
    }

    public static void main(String[] args) {
            System.out.println("What is your name?");
            String name = getName();
            System.out.println("How old are you, " + name + "?");
            int age = getAge();
            System.out.println("Wow, " + name + " you are already " + age + " years old! Where do you live?");
            String address = getAddress();
            System.out.println("So, I've got next information: Your name is " + name + ", you are " + age + " years old and you live in " + address + "! Correct?");
            System.out.println("You answered " + checkInfo().toUpperCase() + "! Thank you!");
    }
}

