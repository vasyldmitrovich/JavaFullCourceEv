package com.softserve.edu06.pt.task2;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public void print(){
        System.out.print("[x = " + this.x + "\ty = " + this.y + "]");
    }
}
