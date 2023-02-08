package com.softserve.edu06.homework.task1;

public class FlyingBird extends Bird{

    public FlyingBird() {
    }

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    /*If you do not change logic in that method, then why you write that method???*/
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
