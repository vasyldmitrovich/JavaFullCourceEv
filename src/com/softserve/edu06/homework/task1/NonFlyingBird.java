package com.softserve.edu06.homework.task1;

public class NonFlyingBird extends Bird {
    public NonFlyingBird() {
    }

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("But I cannot fly!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

