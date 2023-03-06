package com.softserve.edu07.practicaTask2;

public class Students extends Person {
    private final String TYPE_PERSON;
    private String name;

    public Students(String TYPE_PERSON, String name) {
        super(TYPE_PERSON);
        this.TYPE_PERSON = TYPE_PERSON;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.print("I am a Students " + this.TYPE_PERSON);
    }
}