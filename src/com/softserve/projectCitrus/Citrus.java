package com.softserve.projectCitrus;

import java.io.*;

public class Citrus extends Fruit {
    private double vitaminC;

    public Citrus(String name, String color, double vitaminC) {
        super(name, color);
        this.vitaminC = vitaminC;
    }

    public double getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(double vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public String toString() {
        return super.toString() + "Citrus{" +
                "vitaminC=" + vitaminC +
                '}';
    }

    @Override
    public void input() throws IOException {
        super.input();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter vitamin C content (in grams):");
        vitaminC = Double.parseDouble(reader.readLine());
    }

    public void output() {
        System.out.println(this);
    }

    public void input(String filename) throws IOException {
        super.input(filename);
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        vitaminC = Double.parseDouble(reader.readLine());
    }

    public void output(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(this.toString());
        writer.close();
    }
}