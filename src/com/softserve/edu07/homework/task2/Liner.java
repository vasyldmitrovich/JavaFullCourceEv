package com.softserve.edu07.homework.task2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int floors) {
        this.floors = floors;
    }

    public Liner(int passengers, int floors) {
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
        System.out.println("This is " + getClass().getSimpleName() +
                ".\nIt is type of " + getClass().getSuperclass().getSimpleName() +
                ", so it can sail.\nThis " + getClass().getSimpleName() +
                " have " + getFloors() +
                " floors, where can be located up to " + getPassengers() + " passengers.\n");
    }
}
