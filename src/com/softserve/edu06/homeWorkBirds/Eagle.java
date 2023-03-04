package com.softserve.edu06.homeWorkBirds;

public class Eagle extends FlyingBird {

    private String name;
    double bodyMass;

    public Eagle(String name, double bodyMass) {
        super(bodyMass);
        this.bodyMass = bodyMass;
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.print(" \nI am Eagle, " + name + " my body mass " + bodyMass + "kg ");

    }
}
