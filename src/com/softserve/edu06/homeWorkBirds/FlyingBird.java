package com.softserve.edu06.homeWorkBirds;

public class FlyingBird extends FlyAbstr {
    private String Swallow;
    private String Eagle;

    public FlyingBird(String eagle, String swallow) {
        Eagle = eagle;
        Swallow = swallow;
    }

    public FlyingBird(double bodyMass) {
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "Eagle='" + Eagle + '\'' +
                ", Swallow='" + Swallow + '\'' +
                '}';
    }

    @Override
    public void fly() {
    }
    {
        System.out.print(" I can fly ");
    }
}