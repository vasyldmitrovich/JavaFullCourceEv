package com.softserve.edu05.homework.task4;

public class Car {
    private String type;
    private int year;
    private float engineCapacity;

    public Car() {
    }

    public Car(String type, int year, float engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    // Getters and Setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "\nModel: " + type + "\nYear: " + year + "\nEngine capacity: " + engineCapacity;
    }
}
