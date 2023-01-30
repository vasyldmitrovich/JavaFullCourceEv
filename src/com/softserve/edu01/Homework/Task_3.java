package com.softserve.edu01.Homework;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first price ($) of a phone call per minute: ");
        float price_1 = scan.nextFloat();
        System.out.print("Enter the duration (min) of first call: ");
        int time_1 = scan.nextInt();

        System.out.print("\nEnter second price ($) of a phone call per minute: ");
        float price_2 = scan.nextFloat();
        System.out.print("Enter the duration (min) of second call: ");
        int time_2 = scan.nextInt();

        System.out.print("\nEnter third price ($) of a phone call per minute: ");
        float price_3 = scan.nextFloat();
        System.out.print("Enter the duration (min) of third call: ");
        int time_3 = scan.nextInt();

        float sum1 = Sum(price_1, time_1);
        float sum2 = Sum(price_2, time_2);
        float sum3 = Sum(price_3, time_3);

        System.out.println("\nFirst amount: " + sum1 + "$");
        System.out.println("Second amount: " + sum2 + "$");
        System.out.println("Third amount: " + sum3 + "$");

        FullSumOut(sum1, sum2, sum3);
    }

    public static float Sum(float price, int time){
        return price * time;
    }

    public static void FullSumOut(float sum1, float sum2, float sum3){
        float fullSum = sum1 + sum2 + sum3;
        System.out.println("\nFull amount: " + fullSum + "$");
    }
}
