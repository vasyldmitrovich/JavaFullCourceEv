package com.softserve.edu11.hw.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence that contains the words between more than one space.");
        String str = scan.nextLine();
        String[] words = str.split("\\s+");
        for (String temp: words) {
            System.out.print(temp + " ");
        }
    }
}
