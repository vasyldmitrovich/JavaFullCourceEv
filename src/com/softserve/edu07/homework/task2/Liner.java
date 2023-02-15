package com.softserve.edu07.homework.task2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
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
        if (0 <= floors && floors <= 3) {
            System.out.println("The small liner is sailing");
        } else if (4 <= floors && floors <= 6) {
            System.out.println("The medium liner is sailing");
        } else {
            System.out.println("The huge liner is sailing");
        }
    }
}
