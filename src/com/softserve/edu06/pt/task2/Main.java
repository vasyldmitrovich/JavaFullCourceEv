package com.softserve.edu06.pt.task2;

public class Main {
    public static void main(String[] args) {
        Line[] lines = {new Line(2, 3, 4, 5),
                        new ColourLine(3, 4, 5, 6, "red"),
                        new Line(4, 3, 2, 4),
                        new ColourLine(6, 5, 7, 3, "blue")};
        for (Line temp: lines) {
            temp.print();
            System.out.println("");
        }
    }
}
