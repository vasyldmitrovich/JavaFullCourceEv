package com.softserve.edu06.practical.task2;

public class ColorLine extends Line{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColorLine(String color) {
        this.color = color;
    }

    public ColorLine(Point a, Point b, String color) {
        super(a, b);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor of the line is - " + color + "\n*****";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Color of the line is - " + color + "\n*****");
    }
}
