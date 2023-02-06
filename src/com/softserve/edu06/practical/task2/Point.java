package com.softserve.edu06.practical.task2;

public class Point {
    /*Add tab before fields, and order change, first must be constructor after get set and methods*/
private int x;
private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return  "(x = " + x + ", y = " + y + ")";
    }

    public void print() {
        System.out.println("Coordinate x = " + getX() + "\nCoordinate y = " + getY() + "\n*****");
    }
}
