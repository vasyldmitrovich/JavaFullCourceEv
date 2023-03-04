package com.softserve.edu06.homeWorkBirds;

public class Penguin extends NonFlyingBird {
    private String name;
    double bodyMass;

    public Penguin(String name, double bodyMass) {
        super(bodyMass);
        this.bodyMass = bodyMass;
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.print("\nI am Penguin " + name + " my body mass " + bodyMass + "kg  ");
    }
}
