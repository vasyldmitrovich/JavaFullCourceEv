package com.softserve.edu06.practical.task1;

public abstract class Car {
    public String model;
    public int maxSpeed;
    public int yearOfManufacture;

    public Car() {
    }

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void run();

    public abstract void stop();

}
