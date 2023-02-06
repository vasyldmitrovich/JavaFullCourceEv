package com.softserve.edu06.hw.task1;

public class Chicken extends NonFlyingBird{
    private int noiseLevel;

    public Chicken(String feathers, int layEggs, int runSpeed, int noiseLevel) {
        super(feathers, layEggs, runSpeed);
        this.noiseLevel = noiseLevel;
    }

    @Override
    public void fly() {
        System.out.print("I am chicken, ");
        super.fly();
        System.out.print(", my noise level = " + this.noiseLevel + " dB");
    }
}
