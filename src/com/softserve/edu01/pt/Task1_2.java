package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        System.out.println("Hey!\nHow are you?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("You are " + answer + "\nBye!");
    }
}