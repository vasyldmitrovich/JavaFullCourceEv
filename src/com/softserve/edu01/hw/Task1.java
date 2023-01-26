package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Hey!\nEnter the radius of the flower bed: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter of flower bed = " + perimeter + "\nArea of flower bed = " + area + "\nBye!");
    }
}