package com.softserve.edu07.homework.task2;

public class Car extends GroundVehicle{
    private String model;

    public Car() {
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
        System.out.println("This " + model + " can carry " + getPassengers() + " passengers");
    }
}
