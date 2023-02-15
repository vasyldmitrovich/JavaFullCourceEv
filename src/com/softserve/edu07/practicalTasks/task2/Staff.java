package com.softserve.edu07.practicalTasks.task2;

public abstract class Staff extends Person{
    private int salary;
    public Staff() {
        salary = 0;
    }

    public Staff(int salary) {
        this.salary = salary;
    }

    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void salary();

    @Override
    public String toString() {
        return "\nMy name is " + getName();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
