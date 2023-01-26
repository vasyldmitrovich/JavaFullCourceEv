package com.softserve.edu03.pt;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee() {
        totalSum += 1;
    }

    public Employee(String name) {
        this();
        this.name = name;
        this. rate = 0;
        this.hours = 0;
    }

    public Employee(String name, int rate, int hours) {
        this();
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    public int getSalary(){
        return this.hours * this.rate;
    }
    public int getBonuses(){
        return this.getSalary() / 10;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public static int getTotalSum() {
        return totalSum;
    }

}