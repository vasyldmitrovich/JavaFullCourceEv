package com.softserve.edu06.practcalTasks.task1;

public class Truck extends Car {
    private boolean isLoaded;

    public Truck() {
    }

    public Truck(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    public Truck(String model, float maxSpeed, int yearOfManufacture, boolean isLoaded) {
        super(model, maxSpeed, yearOfManufacture);
        this.isLoaded = isLoaded;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    @Override
    public String toString() {
        if(isLoaded) {
            return "Truck is loaded" + "\nModel: " + model + "\nMax speed: "
                    + maxSpeed + " km/h" + "\nYear Of manufacture: " + yearOfManufacture
                    + "\n";
        } else {
            return "Truck is not loaded" + "\nModel: " + model + "\nMax speed: "
                    + maxSpeed + " km/h" + "\nYear Of manufacture: " + yearOfManufacture
                    + "\n";
        }
    }

    @Override
    public void run() {
        if(speed == 0){
            speed += maxSpeed / 2;
            System.out.println("Speed of this truck is " + speed + " km/h");
        } else if ((speed < maxSpeed) && (!isLoaded)){
            speed += maxSpeed / 4;
            System.out.println("Speed of this truck is " + speed + " km/h");
        } else if ((speed < maxSpeed) && (isLoaded)){
            speed += maxSpeed / 8;
            System.out.println("Speed of this truck is " + speed + " km/h");
        } else {
            System.out.println("This is already the max speed");
        }
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("\nThe truck was stopped");
    }
}
