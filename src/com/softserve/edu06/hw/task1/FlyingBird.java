package com.softserve.edu06.hw.task1;

public class FlyingBird extends Bird{
    private int flySpeed;

    public FlyingBird() {
    }

    public FlyingBird(String feathers, int layEggs, int flySpeed) {
        super(feathers, layEggs);
        this.flySpeed = flySpeed;
    }

    @Override
    public void fly() {
        System.out.print("I can fly, my speed = " + this.flySpeed);
    }
}
