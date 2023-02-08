package com.softserve.edu07.hw.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle() {
    }

    public FlyingVehicle(int passengers) {
        super(passengers);
    }
    public abstract void fly();

    public abstract void land();
}



class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("plane is fly");
    }

    @Override
    public void land() {
        System.out.println("plane on land");
    }
}



class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

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
        System.out.println("helicopter is fly");
    }

    @Override
    public void land() {
        System.out.println("helicopter on land");
    }
}
