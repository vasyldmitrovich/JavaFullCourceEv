package com.softserve.edu07.homework.task1;

public abstract class Employee implements Payment {
    private String name;
    private String employeeID;

    public Employee() {
    }

    public Employee(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public int calculatePay() {
        return 0;
    }
}

