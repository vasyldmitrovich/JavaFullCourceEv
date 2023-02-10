package com.softserve.edu07.practical.task1;

public class Dog implements Animal{
    private String name;
    private String type;

    public Dog() {
    }

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void voice() {
        System.out.println("I'm a " + getClass().getSimpleName() + ". My name is " + name + ". My type is " + type + ".\nWoof-Woof!");
    }

}

