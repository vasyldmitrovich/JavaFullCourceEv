package com.softserve.edu07.practicalTasks.task2;

public abstract class Person {
    private String name;

    public Person() {
        name = "nameless";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();
}
