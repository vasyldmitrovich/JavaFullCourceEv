package com.softserve.edu06.hw.task1;

public class Swallow extends FlyingBird{
    private int maneuverability;

    public Swallow(String feathers, int layEggs, int flySpeed, int maneuverability) {
        super(feathers, layEggs, flySpeed);
        this.maneuverability = maneuverability;
    }

    @Override
    public void fly() {
        System.out.print("I am swallow, ");
        super.fly();
        System.out.print(", my maneuverability = " + this.maneuverability + " lvl");
    }
}
