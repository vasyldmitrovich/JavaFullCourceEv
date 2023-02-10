package com.softserve.edu07.practical.task2;

public class Student extends Person {
    private final String TYPE_PERSON = ("\nMy type of person is - " + getClass().getSimpleName());

    public Student() {
        System.out.println(TYPE_PERSON);
    }

    public Student(String name) {
        super(name);
    }


    @Override
    public void print() {
        System.out.println("\nMy name is - " + getName() + "!" + TYPE_PERSON + ".\n");
    }
}
