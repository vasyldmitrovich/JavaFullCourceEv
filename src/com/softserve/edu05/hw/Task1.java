package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int numberOfMonth = scanner.nextInt();
        System.out.println("number of days in this month - " + months[numberOfMonth-1]);
    }
}
