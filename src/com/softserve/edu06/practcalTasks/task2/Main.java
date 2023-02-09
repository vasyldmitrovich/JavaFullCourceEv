package com.softserve.edu06.practcalTasks.task2;

public class Main {
    public static void main(String[] args) {
        Point line1 = new ColorLine(1, 2, 0, 4, "blue");
        Point line2 = new Line(3, -2, 1, 5);
        Point line3 = new ColorLine(-4, 2, -3, 3, "violet");

        Point lines[] = {line1, line2, line3};

        for (Point line : lines) {
            line.print();
            System.out.println();
        }
    }
}
