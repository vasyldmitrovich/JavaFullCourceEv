package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff{
    private final String TYPE_PERSON;

    public Cleaner(String name, String TYPE_PERSON) {
        super(name);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    @Override
    public int salary() {
        return (int) (3000 + Math.random()*1000);
    }

    @Override
    public void print() {
        System.out.print("I am a cleaner.");
    }
}
