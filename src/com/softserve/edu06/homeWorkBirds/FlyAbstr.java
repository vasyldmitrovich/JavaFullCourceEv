package com.softserve.edu06.homeWorkBirds;

public class FlyAbstr extends BirdAbst {

    private String flying;

    public FlyAbstr() {
    }

    @Override
    public String toString() {
        return "FlyAbstr{" +
                "flying='" + flying + '\'' +
                '}';
    }

    public void fly() {

    }
}
