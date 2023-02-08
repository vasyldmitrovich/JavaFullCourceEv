package com.softserve.edu01.Homework;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first price ($) of a phone call per minute: ");
        float price1 = scan.nextFloat();
        System.out.print("Enter the duration (min) of first call: ");
        int time1 = scan.nextInt();

        System.out.print("\nEnter second price ($) of a phone call per minute: ");
        float price2 = scan.nextFloat();
        System.out.print("Enter the duration (min) of second call: ");
        int time2 = scan.nextInt();

        System.out.print("\nEnter third price ($) of a phone call per minute: ");
        float price3 = scan.nextFloat();
        System.out.print("Enter the duration (min) of third call: ");
        int time3 = scan.nextInt();

        float sum1 = Sum(price1, time1);
        float sum2 = Sum(price2, time2);
        float sum3 = Sum(price3, time3);

        System.out.println("\nFirst amount: " + sum1 + "$");
        System.out.println("Second amount: " + sum2 + "$");
        System.out.println("Third amount: " + sum3 + "$");

        FullSumOut(sum1, sum2, sum3);
    }

    public static float Sum(float price, int time) {
        return price * time;
    }

    public static void FullSumOut(float sum1, float sum2, float sum3) {
        float fullSum = sum1 + sum2 + sum3;
        System.out.println("\nFull amount: " + fullSum + "$");
    }
}
