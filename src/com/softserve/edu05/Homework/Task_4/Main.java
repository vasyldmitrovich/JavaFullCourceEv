package com.softserve.edu05.Homework.Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car car1 = new Car("BMW", 2008, 1.8f);
        Car car2 = new Car("Audi", 2021, 4.4f);
        Car car3 = new Car("Mercedes", 2015, 3.6f);
        Car car4 = new Car("Porsche", 2023, 5.0f);

        Car cars[] = {car1, car2, car3, car4};

        System.out.print("Enter the graduation year: ");
        int gradYear = scan.nextInt();
        boolean isYear = false;

        for (int i = 0; i < cars.length; i++) {
            if (gradYear == cars[i].getYear()) {
                System.out.println("Model that has this graduation year: " + cars[i].getType());
                isYear = true;
            }
        }

        if (!isYear) {
            System.out.println("There is no such model in our database... ");
        }

        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) { // Bubble sort
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() < cars[j].getYear()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }

        System.out.println("\nYear of cars from higher to lower: ");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
