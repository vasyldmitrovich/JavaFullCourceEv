package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float firstFloat, secondFloat, thirdFloat;
        int firstInt, secondInt, thirdInt, maxInt, minInt;
        System.out.println("Enter three floating point numbers");
        System.out.print("Enter first: ");
        firstFloat = scanner.nextFloat();
        System.out.print("Enter second: ");
        secondFloat = scanner.nextFloat();
        System.out.print("Enter third: ");
        thirdFloat = scanner.nextFloat();
        if(firstFloat >= -5 && firstFloat <= 5){
            if(secondFloat >= -5 && secondFloat <= 5){
                if(thirdFloat >= -5 && thirdFloat <= 5) System.out.println("all three numbers are in the range of numbers [-5; 5]");
            } else System.out.println("one or more numbers are not in the range of numbers [-5; 5]");
        } else System.out.println("one or more numbers are not in the range of numbers [-5; 5]");
        System.out.println("------------------------------");
        System.out.println("Enter three integer numbers");
        System.out.print("Enter first: ");
        firstInt = scanner.nextInt();
        System.out.print("Enter second: ");
        secondInt = scanner.nextInt();
        System.out.print("Enter third: ");
        thirdInt = scanner.nextInt();
        maxInt = firstInt;
        minInt = firstInt;
        if(maxInt < secondInt){
            maxInt = secondInt;
        } else minInt = secondInt;
        if(maxInt < thirdInt){
            maxInt = thirdInt;
        } else if(minInt > thirdInt) minInt = thirdInt;
        System.out.println("Max int = " + maxInt);
        System.out.println("Min int = " + minInt);




    }
}
