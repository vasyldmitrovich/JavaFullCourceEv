package com.softserve.edu07.practicaTask2;

public abstract class Person  {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();
}
