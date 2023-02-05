package com.softserve.edu06.practical.task1;

public class Main {
    public static void main(String[] args) {
        Car [] cars = new Car[4];
        cars[0] = new Truck("Volvo", 180,2019);
        cars[1] = new Sedan("Tesla", 320, 2021);
        cars[2] = new Truck("MAN", 210,2016);
        cars[3] = new Sedan("Jaguar", 260,2020);
        for (Car entity  : cars) {
            System.out.println(entity);
        }
        System.out.println();
        for (Car car : cars) {
            car.run();
            System.out.println("Police patrol is pursuing you :)");
            car.stop();
        }
    }
}
