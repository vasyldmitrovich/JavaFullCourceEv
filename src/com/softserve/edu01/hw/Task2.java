package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Hey!\nWhat is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Where are you live, " + name);
        String address = scanner.nextLine();
        System.out.println("Ok, " + name + ", your address is " + address + "\n I wrote it down. Bye!");
    }
}