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
            return "Truck is loaded" + "\nModel: " + getModel() + "\nMax speed: "
                    + getMaxSpeed() + " km/h" + "\nYear Of manufacture: " + getYearOfManufacture()
                    + "\n";
        } else {
            return "Truck is not loaded" + "\nModel: " + getModel() + "\nMax speed: "
                    + getMaxSpeed() + " km/h" + "\nYear Of manufacture: " + getYearOfManufacture()
                    + "\n";
        }
    }

    @Override
    public void run() {
        if(getSpeed() == 0){
            setSpeed(getSpeed() + getMaxSpeed() / 2);
            System.out.println("Speed of this truck is " + getSpeed() + " km/h");
        } else if ((getSpeed() < getMaxSpeed()) && (!isLoaded)){
            setSpeed(getSpeed() + getMaxSpeed() / 4);
            System.out.println("Speed of this truck is " + getSpeed() + " km/h");
        } else if ((getSpeed() < getMaxSpeed()) && (isLoaded)){
            setSpeed(getSpeed() + getMaxSpeed() / 8);
            System.out.println("Speed of this truck is " + getSpeed() + " km/h");
        } else {
            System.out.println("This is already the max speed");
        }
    }

    @Override
    public void stop() {
        setSpeed(0);
        System.out.println("\nThe truck was stopped");
    }
}
