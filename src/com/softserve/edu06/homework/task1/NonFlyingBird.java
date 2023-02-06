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

    /*If you do not change logic in that method, then why you write that method???*/
    @Override
    public String toString() {
        return super.toString();
    }
}

