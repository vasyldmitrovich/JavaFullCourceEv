package com.softserve.edu06.hw.task1;

public class Eagle extends FlyingBird{
    private int sightDistance;

    public Eagle(String feathers, int layEggs, int flySpeed, int sightDistance) {
        super(feathers, layEggs, flySpeed);
        this.sightDistance = sightDistance;
    }

    @Override
    public void fly() {
        System.out.print("I am eagle, ");
        super.fly();
        System.out.print(", my sight distance = " + this.sightDistance);
    }
}
