package com.softserve.edu05.homework.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Car [] cars = new Car[4];
        cars [0] = new Car("Roadster", 2020, 3.0);
        cars [1] = new Car("SUV", 2019, 2.2);
        cars [2] = new Car("Coupe", 2008, 1.5);
        cars [3] = new Car("Cabriolet", 2019,2.0);

        //task1
        System.out.println("To display cars from a certain model year - please enter the year:");
        int enteredYear = 0;
        int count = 0;
        while (enteredYear == 0) {
            try {
                enteredYear = new Scanner(System.in).nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("You input not Integer. Please try again input correct data!");
            }
        }
        for (Car car : cars) {
            if (enteredYear == car.getYearOfProduction()) {
                System.out.println("Car #" + ++count + ": " + car);
            }
        }
        if (count == 0) {
            System.out.println("There is any car with such year of production to display");
        }
        // task 2
        System.out.println("\nHere is the list of available cars " +
                "sorted in model year ascending order (from oldest to newest):");
        Car temporary;
        for (int i = 0; i < cars.length-1; i++)
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getYearOfProduction() < cars[i].getYearOfProduction()) {
                    temporary = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temporary;
                }
            }
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
