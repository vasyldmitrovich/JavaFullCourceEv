package com.softserve.edu06.homework.task1;

import com.softserve.edu06.homework.task1.FlyingBird;

public class Swallow extends FlyingBird {
    private boolean isRainingToday;

    public Swallow() {
    }

    public Swallow(boolean isRainingToday) {
        this.isRainingToday = isRainingToday;
    }

    public Swallow(float flightSpeed, int flightDistance, boolean isRainingToday) {
        super(flightSpeed, flightDistance);
        this.isRainingToday = isRainingToday;
    }

    public Swallow(int layEggs, String feathers, float flightSpeed, int flightDistance, boolean isRainingToday) {
        super(layEggs, feathers, flightSpeed, flightDistance);
        this.isRainingToday = isRainingToday;
    }

    public boolean isRainingToday() {
        return isRainingToday;
    }

    public void setRainingToday(boolean rainingToday) {
        isRainingToday = rainingToday;
    }

    @Override
    public String toString() {
        if(isRainingToday) {
            return "This swallow predicts rain"
                    + "\nHatches " + layEggs + " eggs"
                    + "\nHas " + feathers + " feathers"
                    + "\nAnd it can fly " + flightDistance + " km with speed: " + flightSpeed + " km/h\n";
        } else {
            return "This swallow doesn't predict rain"
                    + "\nHatches " + layEggs + " eggs"
                    + "\nHas " + feathers + " feathers"
                    + "\nAnd it can fly " + flightDistance + " km with speed: " + flightSpeed + " km/h\n";
        }
    }
}
