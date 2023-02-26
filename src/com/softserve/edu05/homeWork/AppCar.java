package com.softserve.edu05.homeWork;


import java.util.Scanner;

public class AppCar {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Car cr0 = new Car("Audi", 2012, 2.0);
        Car cr1 = new Car("BMV", 2013, 3.0);
        Car cr2 = new Car("Mercedes-Benz", 2014, 3.2);
        Car cr3 = new Car("Ford", 2015, 2.5);

        Scanner number = new Scanner(System.in);
        System.out.println("Enter car year in the console (2012-2015):  ");
        String result;
        result = switch (number.nextInt()) {
            case 2012 -> cr0.toString();
            case 2013 -> cr1.toString();
            case 2014 -> cr2.toString();
            case 2015 -> cr3.toString();
            default -> "Enter a number from 2012 to 2015";
        };
        System.out.println(result);
    }
}
