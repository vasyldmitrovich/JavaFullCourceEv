package com.softserve.edu01.Practical_tasks;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.print("How are you? ");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        System.out.println("You are " + answer);
    }
}
