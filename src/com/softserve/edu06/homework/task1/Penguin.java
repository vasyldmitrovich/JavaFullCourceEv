package com.softserve.edu06.homework.task1;

public class Penguin extends NonFlyingBird{
    private String type;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public Penguin() {
        super();
    }

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public String toString() {
        return "I'm - " + getType() + ". I have feathers - and it's " + isFeathers() +
                ". I can lay eggs - and it's " + isLayEggs() + ". ";
    }
}
