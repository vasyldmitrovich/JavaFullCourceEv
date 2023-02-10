package com.softserve.edu07.homework.task2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }


    @Override
    public void fly() {
        System.out.println("This is " + getClass().getSimpleName() +
                ".\nIt is type of " + getClass().getSuperclass().getSimpleName() +
                ", so it can fly up to " + maxHeight + " meters height.");
    }

    @Override
    public void land() {
        System.out.println("This " + getClass().getSimpleName() +
                " can take on board up to " + weight +
                " kg of cargo or up to " + getPassengers() + " passengers.\n");
    }
}
