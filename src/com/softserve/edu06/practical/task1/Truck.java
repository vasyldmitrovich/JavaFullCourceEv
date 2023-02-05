package com.softserve.edu06.practical.task1;

public class Truck extends Car{
    @Override
    public void run() {
        System.out.println(model + " Start engine, push accelerator up to " + maxSpeed+ "km/h");
    }

    @Override
    public void stop() {
        System.out.println(model + " Push break, stop engine\n");
    }

    public Truck() {
    }

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "BodyType: Truck, Model: " + model +  ", Maximum speed: " + maxSpeed +
                "km/h, Year of Manufacture: " + yearOfManufacture + ".";
    }
}
