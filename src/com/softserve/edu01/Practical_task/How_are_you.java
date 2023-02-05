package com.softserve.edu01.Practical_task;

import java.util.Scanner;

public class How_are_you {
    public static void main(String[] args) {

        System.out.println("How are you?");
        Scanner console = new Scanner(System.in);
        String answer = console.nextLine();
        System.out.println("You are " + answer +".");
    }
}
