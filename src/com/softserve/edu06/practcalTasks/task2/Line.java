package com.softserve.edu06.practcalTasks.task2;

public class Line extends Point{
    protected Point point1;
    protected Point point2;

    public Line(){
        point1 = new Point();
        point2 = new Point();
    }

    public Line(int x, int y, int x2, int y2){
        point1 = new Point(x, y);
        point2 = new Point(x2, y2);
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return point1.toString() + "\n" + point2.toString();
    }

    public void print(){
        System.out.println(toString());
    }
}
