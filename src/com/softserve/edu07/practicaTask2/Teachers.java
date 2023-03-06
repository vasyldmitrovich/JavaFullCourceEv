package com.softserve.edu07.practicaTask2;

public class Teachers extends Staff {
    public String TYPE_PERSON;
    private final String name;

    public Teachers(String TYPE_PERSON, String name) {
        super(TYPE_PERSON);
        this.TYPE_PERSON = TYPE_PERSON;
        this.name = name;
    }

    @Override
    public int salary() {
        return 20_000;
    }

    @Override
    public void print() {
        System.out.print("I am a Teacher " + this.TYPE_PERSON);
    }
}

