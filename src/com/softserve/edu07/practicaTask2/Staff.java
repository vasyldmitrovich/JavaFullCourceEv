package com.softserve.edu07.practicaTask2;

public abstract class Staff extends Person {

    public Staff(String name) {
        super(name);
    }

    public abstract int salary();

    public abstract void print();
}
