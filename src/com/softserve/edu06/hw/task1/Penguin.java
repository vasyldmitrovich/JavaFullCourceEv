package com.softserve.edu06.hw.task1;

public class Penguin extends NonFlyingBird{
    private int swimSpeed;

    public Penguin(String feathers, int layEggs, int runSpeed, int swimSpeed) {
        super(feathers, layEggs, runSpeed);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void fly() {
        System.out.print("I am penguin, ");
        super.fly();
        System.out.print(", my speed of swimming = " + this.swimSpeed);
    }
}
