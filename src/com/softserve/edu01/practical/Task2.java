package com.softserve.edu01.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {
    private static String answer() {
        Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();

    }

    private static String answer2() {
        String answer2 = "";
        try (InputStream input = System.in;
             InputStreamReader reader = new InputStreamReader(input);
             BufferedReader buffer = new BufferedReader(reader)) {
            answer2 = buffer.readLine();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return answer2;
    }


    public static void main(String[] args) {
        String question1 = "Hello! How are you?";
        System.out.println(question1);
        String answer = answer();
        String question2 = "And how is your family?";
        System.out.println(question2);
        String answer2 = answer2();
        System.out.println("You said you're " + answer + "!");
        System.out.println("You said yours family is " + answer2 + "!");
    }
}

