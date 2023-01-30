package com.softserve.edu01.Homework;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the flower bed: ");
        Scanner scan = new Scanner(System.in);
        float r = scan.nextFloat();

        float C =  2 * r * (float)Math.PI;
        float S =  (float)Math.PI * (float)Math.pow(r, 2);

        System.out.println("\nPerimeter of the flower bad: " + C);
        System.out.println("Area of the flower bad: " + S);
    }
}
