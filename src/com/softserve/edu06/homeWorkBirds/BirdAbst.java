package com.softserve.edu06.homeWorkBirds;

public abstract class BirdAbst {

    private String feathers;
    private String layEggs;

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    public BirdAbst(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public BirdAbst() {
    }

    public abstract void fly();

    {
        System.out.print(" \nI have feathers and can lay eggs  ");
    }
}
