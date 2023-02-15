package com.softserve.edu06.practcalTasks.task1;

public abstract class Car {
    /*Set access modifier protected if in inheritance you will call that variable, or use private*/
    private String model;
    private float maxSpeed;
    private float speed = 0;
    private int yearOfManufacture;

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

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public abstract void run();

    public abstract void stop();
}
