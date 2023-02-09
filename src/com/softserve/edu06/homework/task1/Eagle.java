package com.softserve.edu06.homework.task1;

public class Eagle extends FlyingBird {
    private int flightHeight;

    public Eagle() {
    }

    public Eagle(int flightHeight) {
        this.flightHeight = flightHeight;
    }

    public Eagle(float flightSpeed, int flightDistance, int flightHeight) {
        super(flightSpeed, flightDistance);
        this.flightHeight = flightHeight;
    }

    public Eagle(int layEggs, String feathers, float flightSpeed, int flightDistance, int flightHeight) {
        super(layEggs, feathers, flightSpeed, flightDistance);
        this.flightHeight = flightHeight;
    }

    public int getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(int flightHeight) {
        this.flightHeight = flightHeight;
    }

    @Override
    public String toString() {
        return "This eagle can fly at an altitude of " + flightHeight + " km"
                + "\nHatches " + layEggs + " eggs"
                + "\nHas " + feathers + " feathers"
                + "\nAnd it can fly " + flightDistance + " km with speed: " + flightSpeed + " km/h\n";
    }
}
