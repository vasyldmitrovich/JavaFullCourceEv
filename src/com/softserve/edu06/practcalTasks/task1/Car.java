package com.softserve.edu06.practcalTasks.task1;

public abstract class Car {
    protected String model;
    protected float maxSpeed;
    protected float speed = 0;
    protected int yearOfManufacture;

    public Car() {
    }

    public Car(String model, float maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void run();

    public abstract void stop();
}
