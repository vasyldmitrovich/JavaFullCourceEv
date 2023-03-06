package com.softserve.edu07.practicaTask2;

public class Cleaners extends Staff {
    private String TYPE_PERSON;
    private String name;

    public Cleaners(String TYPE_PERSON, String name) {
        super(TYPE_PERSON);
        this.TYPE_PERSON = TYPE_PERSON;
        this.name = name;
    }

    @Override
    public int salary() {
        return (10_000);
    }

    @Override
    public void print() {
        System.out.print("I am a Cleaners " + this.TYPE_PERSON);
    }
}
