package com.softserve.edu05.practicalTasks.task2;

public class Employee {
    /*Security bug, fields is not private*/
    private String name;
    private int departmentNumber;
    private int salary;

    /*Do not have constructor without parameters*/

    public Employee() {
    }

    public Employee(String name, int departmentNumber, int salary){
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nDepartment number: " + departmentNumber + "\nSalary: " + salary;
    }
}
