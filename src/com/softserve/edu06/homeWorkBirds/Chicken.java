package com.softserve.edu06.homeWorkBirds;

public class Chicken extends NonFlyingBird {
    private String name;
    double bodyMass;

    public Chicken(String feathers, String layEggs, String penguin, String chicken) {
        super(feathers, layEggs, penguin, chicken);
    }

    public Chicken(String name, double bodyMass) {
        super(bodyMass);
        this.bodyMass = bodyMass;
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.print("\nI am Chicken " + name + " my body mass " + bodyMass + "kg ");
    }
}
