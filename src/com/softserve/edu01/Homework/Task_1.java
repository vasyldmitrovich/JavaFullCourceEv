package com.softserve.edu01.Homework;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the flower bed: ");
        Scanner scan = new Scanner(System.in);
        float radius = scan.nextFloat();

        float perimeter = 2 * radius * (float) Math.PI;
        float area = (float) Math.PI * (float) Math.pow(radius, 2);

        System.out.println("\nPerimeter of the flower bad: " + perimeter);
        System.out.println("Area of the flower bad: " + area);
    }
}
