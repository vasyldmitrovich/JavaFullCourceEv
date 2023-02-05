package com.softserve.edu06.practical.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Display print method for Point instance:");
        Point p = new Point(1,1);
        p.print();
        System.out.println("Display print method for Line instance:");
        Line l = new Line (new Point(2,2), new Point(3,3));
        l.print();
        System.out.println("Display print method for ColorLine instance:");
        ColorLine c = new ColorLine(new Point(4,4), new Point(5,5), "white");
        c.print();
        ArrayList <Line> lines = new ArrayList<>();
        Line line1 = new Line(new Point(6,6), new Point(7,7));
        Line line2 = new ColorLine(new Point(8,8), new Point(9,9), "red");
        Point v = new Point();
        Point w = new Point();
        ColorLine color = new ColorLine(v,w, "blue");
        v.setX(10);
        v.setY(10);
        w.setX(11);
        w.setY(11);
        color.setColor("black");
        Collections.addAll(lines,line1, line2, color);
        for (Line line : lines) {
            System.out.println(line);
        }
    }
}
