package com.softserve.edu06.homework.task1;

public abstract class Bird {
    protected int layEggs;
    protected String feathers;

    public Bird() {
    }

    public Bird(int layEggs, String feathers) {
        this.layEggs = layEggs;
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public abstract void fly();
}
