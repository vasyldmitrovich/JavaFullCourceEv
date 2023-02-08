package com.softserve.edu01.Practical_tasks;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How are you? ");
        String answer = scan.nextLine();

        System.out.println("You are " + answer);
    }
}
