package com.softserve.edu01.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hello, what is your name? ");
        String name = scan.nextLine();

        System.out.print("Where do you live " + name + "? ");
        String address = scan.nextLine();

        System.out.println("So, your name is " + name + " and you live in " + address + " ^-^.");
    }
}
