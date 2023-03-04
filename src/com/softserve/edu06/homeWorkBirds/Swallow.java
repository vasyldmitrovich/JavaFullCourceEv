package com.softserve.edu06.homeWorkBirds;

public class Swallow extends FlyingBird {
    private String name;
    double bodyMass;

    public Swallow(String name, double bodyMass) {
        super(bodyMass);
        this.bodyMass = bodyMass;
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.print("\nI am Swallow " + name + " my body mass " + bodyMass + "g ");
    }
}
