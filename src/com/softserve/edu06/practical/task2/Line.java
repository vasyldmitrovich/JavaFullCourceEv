package com.softserve.edu06.practical.task2;

public class Line {
    /*Why fields do not private?*/
    Point a = new Point();
    Point b = new Point();

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Line() {
    }

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println("Line is between 2 points: \nPoint a = " + a.toString() + "\nPoint b = " + b.toString() + "\n*****");
    }

    @Override
    public String toString() {
        return "Line coordinates: " +
                "\nPoint 1: " + a +
                "\nPoint 2: " + b + "\n*****";
    }
}