package com.softserve.edu06.homeWorkBirds;

public class NonFlyingBird extends BirdAbst {

    private String Chicken;
    private String Penguin;

    public NonFlyingBird(String feathers, String layEggs, String penguin, String chicken) {
        super(feathers, layEggs);
        Penguin = penguin;
        Chicken = chicken;
    }

    public NonFlyingBird(double bodyMass) {
    }

    @Override
    public void fly() {
    }
    {
        System.out.print(" I can't fly ");
    }
}
