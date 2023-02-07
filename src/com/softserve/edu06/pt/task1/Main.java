package com.softserve.edu06.pt.task1;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Sedan("BMW", 240, 2010),
                new Truck("Ford", 220, 2008),
                new Sedan("Mazda", 230, 2012),
                new Truck("Opel", 215, 2011)};
        for (Car temp: cars) {
            /*Do not need toString() because that method will work automatically*/
            System.out.println(temp.toString());
        }
    }
}