package com.softserve.edu06.pt.task2;

public class Line extends Point{
    private Point begin;
    private Point end;

    public Line() {
    }

    public Line(int xBegin, int yBegin, int xEnd, int yEnd) {
        this.begin = new Point(xBegin, yBegin);
        this.end = new Point(xEnd, yEnd);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
    @Override
    public void print(){
        System.out.print("Line: start - ");
        this.begin.print();
        System.out.print("\t end - ");
        this.end.print();
    }
}
