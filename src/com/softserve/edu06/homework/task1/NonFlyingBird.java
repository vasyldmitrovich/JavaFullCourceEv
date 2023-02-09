package com.softserve.edu06.homework.task1;

import com.softserve.edu06.homework.task1.Bird;

public class NonFlyingBird extends Bird {
    protected float runningSpeed;
    protected int runningDistance;

    public NonFlyingBird() {
    }

    public NonFlyingBird(float runningSpeed, int runningDistance) {
        this.runningSpeed = runningSpeed;
        this.runningDistance = runningDistance;
    }

    public NonFlyingBird(int layEggs, String feathers, float runningSpeed, int runningDistance) {
        super(layEggs, feathers);
        this.runningSpeed = runningSpeed;
        this.runningDistance = runningDistance;
    }

    public float getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(float runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public int getRunningDistance() {
        return runningDistance;
    }

    public void setRunningDistance(int runningDistance) {
        this.runningDistance = runningDistance;
    }

    @Override
    public void fly() {
        System.out.println("Unfortunately, I can't fly...\n");
    }
}
