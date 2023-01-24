package com.softserve.edu01.homework;

public class Task1 {
    private final static int radius = 5;
    private static double perimeterCalculation (int radiusValue) {
        return 2*Math.PI*radiusValue;
    }
    private static double areaCalculation (int radiusValue) {
        return Math.PI * Math.pow(radiusValue, 2);
    }

    public static void main(String[] args) {
        System.out.printf("The perimeter of the circle is %f \n", perimeterCalculation(radius));
        System.out.printf("The area of the circle is %f \n", areaCalculation(radius));
    }
}
