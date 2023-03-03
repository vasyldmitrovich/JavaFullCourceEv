package com.softserve.edu06.practicaTask2;

public class ColorLine extends Line {

    public String getColor() {
        return color;
    }

    private String color;

    public ColorLine(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "Color='" + color +
                '}';
    }

    @Override
    public void print() {
        super.print();
        System.out.println("color = " + this.color);

    }
}
