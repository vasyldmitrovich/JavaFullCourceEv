package com.softserve.edu07.pt.task2;

public class Student extends Person{
    private final String TYPE_PERSON;

    public Student(String name, String TYPE_PERSON) {
        super(name);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.print("I am a student.");
    }
}
