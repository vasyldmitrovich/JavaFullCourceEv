package com.softserve.edu06.practcalTasks.task1;

public class Sedan extends Car {
    private int priceOnOLX;

    public Sedan() {
    }

    public Sedan(int priceOnOLX) {
        this.priceOnOLX = priceOnOLX;
    }

    public Sedan(String model, float maxSpeed, int yearOfManufacture, int priceOnOLX) {
        super(model, maxSpeed, yearOfManufacture);
        this.priceOnOLX = priceOnOLX;
    }

    public int getPriceOnOLX() {
        return priceOnOLX;
    }

    public void setPriceOnOLX(int priceOnOLX) {
        this.priceOnOLX = priceOnOLX;
    }

    public String toString() {
        return "Price of this sedan on OLX: " + priceOnOLX + "$" + "\nModel: "
                + getModel() + "\nMax speed: " + getMaxSpeed() + " km/h"
                + "\nYear of manufacture: " + getYearOfManufacture() + "\n";
    }

    @Override
    public void run() {
        if(getSpeed() == 0){
            setSpeed(getSpeed() + getMaxSpeed() / 2);
            System.out.println("Speed of this car is " + getSpeed() + " km/h");
        } else if (getSpeed() < getMaxSpeed()){
            setSpeed(getSpeed() + getMaxSpeed() / 4);
            System.out.println("Speed of this car is " + getSpeed() + " km/h");
        } else{
            System.out.println("This is already the max speed");
        }
    }

    @Override
    public void stop() {
        setSpeed(0);
        System.out.println("\nThe sedan was stopped");
    }
}
