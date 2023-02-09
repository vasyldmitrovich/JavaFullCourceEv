package com.softserve.edu06.practcalTasks.task2;

public class ColorLine extends Line {
    public String color;

    public ColorLine() {
    }

    public ColorLine(String color) {
        this.color = color;
    }

    public ColorLine(int x, int y, int x2, int y2, String color) {
        super(x, y, x2, y2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + color;
    }

    public void print(){
        System.out.println(toString());
    }
}
