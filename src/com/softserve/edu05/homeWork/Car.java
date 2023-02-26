package com.softserve.edu05.homeWork;

public class Car {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int year;

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    private double engineCapacity;


    public Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setYear() {
    }

    @Override
    public String toString() {
        return "String type - " + getType() + "  year is  - " + getYear() + " " + getEngineCapacity();
    }

}
