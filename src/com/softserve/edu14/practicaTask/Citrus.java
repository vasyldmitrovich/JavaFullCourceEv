package com.softserve.edu14.practicaTask;

import com.softserve.edu14.ProjectFruit;

public class Citrus extends ProjectFruit {
    private double vitaminC;

    public Citrus(String name, String color, double vitaminC) {
        super(name, color);
        this.vitaminC = vitaminC;
    }

    public Citrus(double vitaminC) {
        super();
        this.vitaminC = vitaminC; //this.vitaminC = 0.0;
    }

    public double getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(double vitaminC) {
        this.vitaminC = vitaminC;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Vitamin C: " + getVitaminC() + "gram");
    }
}