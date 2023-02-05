package com.softserve.edu01.Home_work;

import java.util.Scanner;

public class Flower {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println ("Enter the radius");
        int r = console.nextInt();
        double perimeter = 2*Math.PI*r;  //    Math.PI - число Пі - 3.14...
        double area = 2*Math.PI*(r*r);
        System.out.printf("Perimeter shaped like is" + " "+"%.2f", perimeter); //  "%.2f", заокруглення до 2-го значення після коми (printf)
        System.out.printf(" end area shaped like is" + " "+ "%.2f",area);
    }
}
