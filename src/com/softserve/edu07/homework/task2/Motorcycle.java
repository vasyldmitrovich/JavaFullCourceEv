package com.softserve.edu07.homework.task2;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle() {
    }

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("This motorbike can drive at a speed of " + maxSpeed + " km/h");
    }
}
