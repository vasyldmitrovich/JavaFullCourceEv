package com.softserve.edu06.practicaTask2;

public class Line extends Point {
    private Point x;
    private Point y;

    /*This constructor is not correct, you must take for first point x and y and for secont point x and y*/
    public Line(int x, int y) {
        this.x = new Point(x, y);
        this.y = new Point(x, y);
    }

    @Override
    public String toString() {
        return "Line{" + "x " + x + "y" +
                y + "}";
    }

    @Override
    public void print() {
        System.out.println("Line x, y - " + x + y);

    }
}

