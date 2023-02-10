package com.softserve.edu07.practical.task2;

public class Teacher extends Staff{
    private final String TYPE_PERSON = ("\nMy type of person is - " + getClass().getSimpleName());
    private int salary;
    public Teacher() {
        System.out.println(TYPE_PERSON);
    }

    public Teacher(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("\nMy name is - " + getName() + "! \nMy salary is - " + salary() + "₴." + TYPE_PERSON +".");
    }

    @Override
    public int salary() {
        // may be fixed (could be like a class field) or just to return value
        return salary;
    }
}
