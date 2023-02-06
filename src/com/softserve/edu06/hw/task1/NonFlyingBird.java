package com.softserve.edu06.hw.task1;

public class NonFlyingBird extends Bird{
    private int runSpeed;

    public NonFlyingBird() {
    }

    public NonFlyingBird(String feathers, int layEggs, int runSpeed) {
        super(feathers, layEggs);
        this.runSpeed = runSpeed;
    }

    @Override
    public void fly() {
        System.out.print("I can run, my speed = " + this.runSpeed);
    }
}
