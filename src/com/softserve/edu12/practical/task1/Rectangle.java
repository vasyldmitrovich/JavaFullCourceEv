package com.softserve.edu12.practical.task1;

public class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle() {
    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int squareRectangle () throws MyException {
        int area;
        if (getSideA() >= 0 && getSideB() >= 0) {
            area = getSideA()*getSideB();
        }
        else throw new MyException ("This is not a shape!");
        return area;
    }
}
