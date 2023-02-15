package com.softserve.edu07.homework.task2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat() {
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
        if (0 <= volume && volume <= 5) {
            System.out.println("The small boat is sailing");
        } else if (6 <= volume && volume <= 12) {
            System.out.println("The medium boat is sailing");
        } else {
            System.out.println("The big boat is sailing");
        }
    }
}
