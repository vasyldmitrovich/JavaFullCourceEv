package com.softserve.edu06.homework.task1;

import com.softserve.edu06.homework.task1.Bird;

public class FlyingBird extends Bird {
    protected float flightSpeed;
    protected int flightDistance;

    public FlyingBird() {
    }

    public FlyingBird(float flightSpeed, int flightDistance) {
        super();
        this.flightSpeed = flightSpeed;
        this.flightDistance = flightDistance;
    }

    public FlyingBird(int layEggs, String feathers, float flightSpeed, int flightDistance) {
        super(layEggs, feathers);
        this.flightSpeed = flightSpeed;
        this.flightDistance = flightDistance;
    }

    public float getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(float flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(int flightDistance) {
        this.flightDistance = flightDistance;
    }

    @Override
    public void fly() {
        System.out.println("I love to fly. I can fly " + flightDistance + " km in " + flightDistance / flightSpeed + " hours\n");
    }
}
