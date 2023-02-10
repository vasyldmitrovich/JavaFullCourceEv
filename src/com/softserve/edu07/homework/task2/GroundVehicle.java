package com.softserve.edu07.homework.task2;

public abstract class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle() {
    }

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}
