package com.softserve.edu07.homeWork;

public class Employee implements PaymentInterface {
    private String employeedId;
    private String name;

    public Employee() {
    }

    public String getEmployeedId() {
        return employeedId;
    }

    public void setEmployeedId(String employeedId) {
        this.employeedId = employeedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String employeedId, String name) {
        this.employeedId = employeedId;
        this.name = name;
    }

    @Override
    public int calculatePay() {
        return 0;
    }

}
