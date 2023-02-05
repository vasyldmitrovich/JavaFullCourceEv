package com.softserve.edu05.homework.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Car() {
    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car type - " + type + ", model year - "
                + yearOfProduction + ", engine capacity - " + engineCapacity + "L.";
    }

    public static int chooseSortingOption() {
        System.out.println("""
                \nWe can sort cars by a model year, press:
                1 - to display cars sorted in ascending order (from oldest to newest)
                2 - to display cars sorted in descending order (from newest to oldest)""");
        int option = 0;
        while (option <= 0 || option > 2) {
            try {
                option = new Scanner(System.in).nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("You input not Integer. Please try again input correct data!");
            }
        }
        return option;
    }

    public static Car[] sortingByYearOfProduction(Car[] array, int length, int option) {
        Car temporary;
        if (option == 1) {
            for (int i = 0; i < length - 1; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (array[j].getYearOfProduction() < array[i].getYearOfProduction()) {
                        temporary = array[i];
                        array[i] = array[j];
                        array[j] = temporary;
                    }
                }
            }
        } else {
            for (int i = 0; i < length - 1; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (array[j].getYearOfProduction() > array[i].getYearOfProduction()) {
                        temporary = array[i];
                        array[i] = array[j];
                        array[j] = temporary;
                    }
                }
            }
        }
        return array;
    }

    public static void printSortedArray(Car[] array) {
        System.out.println("\nHere is the sorted list of available cars:");
        for (Car car : array) {
            System.out.println(car);
        }
    }

    public static int getModelYear() {
        System.out.println("To display cars from a certain model year - please enter the year:");
        int enteredYear = 0;
        while (enteredYear == 0) {
            try {
                enteredYear = new Scanner(System.in).nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("You input not Integer. Please try again input correct data!");
            }
        }
        return enteredYear;
    }

    public static void printSelectedObjects(Car[] array, int enteredYear) {
        int count = 0;
        for (Car car : array) {
            if (enteredYear == car.getYearOfProduction()) {
                System.out.println("Car #" + ++count + ": " + car);
            }
        }
        if (count == 0) {
            System.out.println("There is any car with such year of production to display");
        }
    }
}