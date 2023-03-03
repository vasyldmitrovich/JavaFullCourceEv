package com.softserve.edu06.practicaTask2;

public class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return
                " Point {" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
    }

    public void print() {
        System.out.print("");//"[x = " + this.x + "\ty = " + this.y + "] "

    }
}
