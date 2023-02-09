package com.softserve.edu06.homework.task1;

import com.softserve.edu06.homework.task1.NonFlyingBird;

public class Penguin extends NonFlyingBird {
    private int divingDepth;

    public Penguin() {
    }

    public Penguin(int divingDepth) {
        this.divingDepth = divingDepth;
    }

    public Penguin(float runningSpeed, int runningDistance, int divingDepth) {
        super(runningSpeed, runningDistance);
        this.divingDepth = divingDepth;
    }

    public Penguin(int layEggs, String feathers, float runningSpeed, int runningDistance, int divingDepth) {
        super(layEggs, feathers, runningSpeed, runningDistance);
        this.divingDepth = divingDepth;
    }

    public int getDivingDepth() {
        return divingDepth;
    }

    public void setDivingDepth(int divingDepth) {
        this.divingDepth = divingDepth;
    }

    @Override
    public String toString() {
        return "This penguin can dive to a depth of " + divingDepth + " m"
                + "\nHatches " + layEggs + " eggs"
                + "\nHas " + feathers + " feathers"
                + "\nAnd can run " + runningDistance + " km with speed: " + runningSpeed + " km/h\n";
    }
}
