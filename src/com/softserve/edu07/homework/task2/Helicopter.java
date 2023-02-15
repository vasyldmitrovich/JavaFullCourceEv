package com.softserve.edu07.homework.task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter() {
    }

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("This helicopter can fly at a height of " + maxHeight + " m");
    }

    @Override
    public void land() {
        System.out.println("This helicopter on the ground, his weight is " + weight + " kg");
    }
}
