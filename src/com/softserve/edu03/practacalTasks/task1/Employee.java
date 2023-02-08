package com.softserve.edu03.practacalTasks.task1;

public class Employee {
    private static int totalSum = 0;

    private String name;
    private float rate;
    private int hours;

    // Constructors
    public Employee() {
        totalSum++;
    }

    public Employee(String name) {
        this.name = name;
        this.rate = 25;
        this.hours = 8;

        totalSum++;
    }

    public Employee(String name, float rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;

        totalSum++;
    }

    // Getters and setters

    public static int getTotalSum() {
        return totalSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    // Main functions

    public float getSalary() {
        return rate * hours;
    }

    public float getBonuses() {
        return getSalary() / 10;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nRate: " + rate + "\nWorking hours per month: " + hours + "\nSalary: " + getSalary()
                + " $" + "\nPossible bonuses: " + getBonuses() + " $\n";
    }
}
