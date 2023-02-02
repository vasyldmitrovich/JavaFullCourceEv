package com.softserve.edu05.Practical_tasks.Task_2;

public class Employee {
    String name;
    int department_number;
    int salary;

    public Employee(String name, int department_number, int salary){
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    public void print(){
        System.out.println("\nName: " + name + "\nDepartment number: " + department_number  + "\nSalary: " + salary );
    }

    public int getDepartment_number() {
        return department_number;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
