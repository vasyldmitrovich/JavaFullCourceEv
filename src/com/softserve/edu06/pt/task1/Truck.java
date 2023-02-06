package com.softserve.edu06.pt.task1;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model,maxSpeed, yearOfManufacture);
    }
    @Override
    public void run(){
        System.out.println("Run");
    }
    @Override
    public void stop(){
        System.out.println("Stop");
    }

    @Override
    public String toString() {
        return "Truck " + this.getModel() + "\tspeed " + this.getMaxSpeed() + "\tyear of manufacture " + this.getYearOfManufacture() ;
    }
}
