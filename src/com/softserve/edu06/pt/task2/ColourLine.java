package com.softserve.edu06.pt.task2;

public class ColourLine extends Line{
    private String colour;

    public ColourLine(int xBegin, int yBegin, int xEnd, int yEnd, String colour) {
        super(xBegin, yBegin, xEnd, yEnd);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "ColourLine{" +
                "colour='" + colour + '\'' +
                '}';
    }
    @Override
    public void print(){
        super.print();
        System.out.print(" Colour = " + this.colour);

    }
}
