package com.softserve.edu05.practicaTask;

public class MarketEmployee {
    private final String fieldsName;
    private int departmentNumber;
    private int salary;

    public MarketEmployee(String fieldsName, int departmentNumber, int salary) {
        this.fieldsName = fieldsName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getFieldsName() {
        return fieldsName;
    }

     public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
