package com.softserve.edu07.homework.task2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int volume) {
        this.volume = volume;
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("This is " + getClass().getSimpleName() +
                ".\nIt is type of " + getClass().getSuperclass().getSimpleName() +
                ", so it can sail.\nThis " + getClass().getSimpleName() +
                " have overall volume of " + getVolume() +
                " cubic meters, and passenger capacity up to " + getPassengers() + " passengers.\n");
    }
}
