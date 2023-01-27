package com.softserve.edu03.practical;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int employeeCount;
    private static final ArrayList<Employee> allEmployees = new ArrayList<>();

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
        if (rate > 0) {
            this.rate = rate;
        } else {
            System.out.println("Please input correct data");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 0) {
            this.hours = hours;
        } else {
            System.out.println("Please input correct data");
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static double getSalaryBudget(){
        double salaryBudget = 0.0;
        for (Employee person : allEmployees) {
            salaryBudget = salaryBudget + person.totalIncome();
        }
        return salaryBudget;
    }

    @Override
    public String toString() {
        return "Employee name is " + getName() + "!\n" +
                "Info: " + "\n" +
                "Hourly rate is " + getRate() + "€ per hour" + ",\n" +
                "Working schedule is " + getHours() + " hours per month" + ",\n" +
                "Monthly salary is " + getSalary() + "€" + ",\n" +
                "Monthly bonus is " + getBonuses() + "€" + ",\n" +
                "Total income before tax is " + totalIncome() + "€." + "\n"
                ;
    }

    public Employee() {
        employeeCount++;
        allEmployees.add(this);
    }

    public Employee(String name, int rate, int hours) {
        this();
        this.name = name;
        this.rate = (Math.max(rate, 0));
        this.hours = (Math.max(hours, 0));
    }

    public Employee(int rate, int hours) {
        this();
        this.rate = (Math.max(rate, 0));
        this.hours = (Math.max(hours, 0));
    }

    public Employee(String name) {
        this();
        this.name = name;
    }

    public int getSalary() {
        return this.rate * this.hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public double totalIncome() {
        return getSalary() + getBonuses();
    }
}
