package com.softserve.edu06.practcalTasks.task2;

public class Point {
    protected int x;
    protected int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

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

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }

    public void print(){
        System.out.println(toString());
    }
}
