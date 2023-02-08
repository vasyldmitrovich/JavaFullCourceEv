package com.softserve.edu07.hw.task2;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle() {
    }

    public WaterVehicle(int passengers) {
        super(passengers);
    }
    public abstract void isSailing();
}


class liner extends WaterVehicle{
    private int floors;

    public liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("the liner is sailing");
    }
}


class Boat extends WaterVehicle{
    private int volume;

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
        System.out.println("the boat is sailing");
    }
}
