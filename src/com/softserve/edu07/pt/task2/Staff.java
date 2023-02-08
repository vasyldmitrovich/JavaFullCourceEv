package com.softserve.edu07.pt.task2;

public abstract class Staff extends Person{
    public Staff(String name) {
        super(name);
    }

    public abstract int salary();
    public abstract void print();
}
