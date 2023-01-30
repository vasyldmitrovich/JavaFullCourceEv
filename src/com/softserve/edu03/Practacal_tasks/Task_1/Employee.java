package com.softserve.edu03.Practacal_tasks.Task_1;

public class Employee {
    private String name;
    private float rate;
    private int hours;

    static int totalSum = 0;

    // Constructors

    public Employee(){
        totalSum++;
    }

    public Employee(String name){
        this.name = name;
        this.rate = 25;
        this.hours = 8;

        totalSum++;
    }

    public Employee(String name, float rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;

        totalSum++;
    }

    // Main functions

    public float getSalary(){
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nRate: " + rate + "\nWorking hours per month: " + hours + "\nSalary: " + getSalary() + " $"
                + "\nPossible bonuses: " + getBonuses() + " $\n";
    }

    public float getBonuses(){
        return getSalary() / 10;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public float getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
