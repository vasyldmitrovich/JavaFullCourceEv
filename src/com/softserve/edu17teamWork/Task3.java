package com.softserve.edu17teamWork;

public class Task3 {
    public static void run(float dollarValue, float amountOfHryvnias){
        try {
            System.out.println("You can buy or exchange: " + amountOfHryvnias / dollarValue + "$");
        } catch (ArithmeticException e){
            System.out.println("Dividing by zero is not pretty :/");
        }
    }
}
