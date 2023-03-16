package com.softserve.projectCitrus;

import java.io.*;
import java.util.Scanner;

public class Fruit implements Serializable {

    protected String name;
    protected String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    protected void input(String filename) throws IOException {
    }

    public void input() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the name of the fruit: ");
            name = br.readLine();
            System.out.print("Enter the color of the fruit: ");
            color = br.readLine();
        } catch (IOException e) {
            System.out.println("Error reading from console!");
        }
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    public void print(PrintWriter pw) {
        pw.println("Name: " + name);
        pw.println("Color: " + color);
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}