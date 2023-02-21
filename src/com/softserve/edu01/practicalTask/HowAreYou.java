package com.softserve.edu01.practicalTask;

import java.util.Scanner;

public class HowAreYou {
    public static void main(String[] args) {

        System.out.println("How are you?");
        Scanner console = new Scanner(System.in);
        String answer = console.nextLine();
        System.out.println("You are " + answer + ".");
    }
}
