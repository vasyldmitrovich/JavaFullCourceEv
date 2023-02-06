package com.softserve.edu06.homework.task1;

public class Chicken extends NonFlyingBird{
    private String type;
    public Chicken() {
    }

    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
