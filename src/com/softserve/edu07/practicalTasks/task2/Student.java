package com.softserve.edu07.practicalTasks.task2;

public class Student extends Person{
    private final String TYPE_PERSON;

    public Student() {
        TYPE_PERSON = "student";
    }

    public Student(String name) {
        super(name);
        TYPE_PERSON = "student";
    }

    public Student(String name, String TYPE_PERSON) {
        super(name);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public String toString() {
        return "\nMy name is " + getName() + " and I am a " + TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
