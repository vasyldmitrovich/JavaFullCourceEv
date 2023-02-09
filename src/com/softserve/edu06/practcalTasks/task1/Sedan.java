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
                + model + "\nMax speed: " + maxSpeed + " km/h"
                + "\nYear Of manufacture: " + yearOfManufacture + "\n";
    }

    @Override
    public void run() {
        if(speed == 0){
            speed += maxSpeed / 2;
            System.out.println("Speed of this car is " + speed + " km/h");
        } else if (speed < maxSpeed){
            speed += maxSpeed / 4;
            System.out.println("Speed of this car is " + speed + " km/h");
        } else{
            System.out.println("This is already the max speed");
        }
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("\nThe sedan was stopped");
    }
}
