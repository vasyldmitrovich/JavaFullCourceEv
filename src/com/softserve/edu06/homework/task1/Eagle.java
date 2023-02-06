package com.softserve.edu06.homework.task1;

public class Eagle extends FlyingBird{
    public Eagle() {
    }

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String toString() {
        return "I'm - " + getType() + ". I have feathers - and it's " + isFeathers() +
                ". I can lay eggs - and it's " + isLayEggs() + ". ";
    }

    @Override
    public void fly() {
        super.fly();
    }
}
