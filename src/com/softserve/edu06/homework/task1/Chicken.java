package com.softserve.edu06.homework.task1;

public class Chicken extends NonFlyingBird {
    private boolean isSitter;

    public Chicken() {
    }

    public Chicken(boolean isSitter) {
        this.isSitter = isSitter;
    }

    public Chicken(float runningSpeed, int runningDistance, boolean isSitter) {
        super(runningSpeed, runningDistance);
        this.isSitter = isSitter;
    }

    public Chicken(int layEggs, String feathers, float runningSpeed, int runningDistance, boolean isSitter) {
        super(layEggs, feathers, runningSpeed, runningDistance);
        this.isSitter = isSitter;
    }

    public boolean isSitter() {
        return isSitter;
    }

    public void setSitter(boolean sitter) {
        isSitter = sitter;
    }

    @Override
    public String toString() {
        if(isSitter) {
            return "This chicken is a sitter"
                    + "\nHatches " + layEggs + " eggs"
                    + "\nHas " + feathers + " feathers"
                    + "\nAnd can run " + runningDistance + " km with speed: " + runningSpeed + " km/h\n";
        } else {
            return "This chicken is not a sitter"
                    + "\nHatches " + layEggs + " eggs"
                    + "\nHas " + feathers + " feathers"
                    + "\nAnd can run " + runningDistance + " km with speed: " + runningSpeed + " km/h\n";
        }
    }
}
