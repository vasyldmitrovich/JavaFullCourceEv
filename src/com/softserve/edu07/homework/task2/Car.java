package com.softserve.edu07.homework.task2;

public class Car extends GroundVehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("This is " + getModel() + " " + getClass().getSimpleName() +
                ".\nIt is type of " + getClass().getSuperclass().getSimpleName() +
                ", so it can drive on a road and transfer up to " + getPassengers() + " passengers.");
    }
}
