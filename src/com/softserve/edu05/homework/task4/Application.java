package com.softserve.edu05.homework.task4;

public class Application {

    public static void main(String[] args) {
        Car [] cars = new Car[4];
        cars [0] = new Car("Roadster", 2020, 3.0);
        cars [1] = new Car("SUV", 2019, 2.2);
        cars [2] = new Car("Coupe", 2008, 1.5);
        cars [3] = new Car("Cabriolet", 2019,2.0);
        //task1
        Car.printSelectedObjects(cars, Car.getModelYear());
        // task 2
        Car.sortingByYearOfProduction(cars, cars.length, Car.chooseSortingOption());
        Car.printSortedArray(cars);
    }
}
