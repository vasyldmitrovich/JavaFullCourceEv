package com.softserve.edu04.homeWork;

import java.util.Scanner;

public class FloatNumber<floatNumber> {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float floatNumber = sc.nextFloat();

        if ((floatNumber >= -5) && (floatNumber <= 5)) {
            System.out.println(floatNumber);
        } else
            System.out.println("Error enter a number between -5 to 5");
    }
}

