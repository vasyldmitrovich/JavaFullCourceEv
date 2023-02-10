package com.softserve.edu07.homework.task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

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
        System.out.println("This is " + getClass().getSimpleName() +
                ".\nIt is type of " + getClass().getSuperclass().getSimpleName() +
                ", so it can fly.");
    }

    public void land() {
        System.out.println("This " + getClass().getSimpleName() +
                " can cover up to " + getMaxDistance() +
                " km before land, and transfer up to " + getPassengers() + " passengers.\n");
    }
}
