package com.softserve.edu06.practicaTask;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public String toString() {
        return "Truck " + this.getModel() + "\tMax speed " + this.getMaxSpeed() + "\tYear of manufacture " + this.getYearOfManufacture();
    }
}