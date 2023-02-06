package com.softserve.edu06.pt.task1;

public class Sedan extends Car{

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
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
        return "Sedan " + this.getModel() + "\tspeed " + this.getMaxSpeed() + "\tyear of manufacture " + this.getYearOfManufacture() ;
    }
}
