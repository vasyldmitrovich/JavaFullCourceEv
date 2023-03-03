package com.softserve.edu06.practicaTask2;

public class Main {
    public static void main(String[] args) {
        Line[] lines = {new Line(2, 3),
                new ColorLine(6, 7, "black"),};

        for (Line temp : lines) {
            temp.print();
            System.out.println(" ");
        }
    }
}
