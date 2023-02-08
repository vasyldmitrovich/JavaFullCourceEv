package com.softserve.edu01.practical;

import java.util.Scanner;

public class Task1 {
    private static int getNumber() {
        return new Scanner(System.in).nextInt();
    }

    private static int addMethod(int a, int b) {
        return Math.addExact(a, b);
    }

    private static int subtractMethod(int a, int b) {
        return Math.subtractExact(a, b);
    }

    private static int multiplyMethod(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    private static int divideMethod(int a, int b) {
        return Math.divideExact(a, b);
    }

    private static int remainderMethod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int a = getNumber();
        int b = getNumber();
        System.out.printf("The result of adding numbers %d and %d is %d! \n", a, b, addMethod(a, b));
        System.out.printf("The result of subtracting numbers %d and %d is %d! \n", a, b, subtractMethod(a, b));
        System.out.printf("The result of multiplying numbers %d and %d is %d! \n", a, b, multiplyMethod(a, b));
        System.out.printf("The result of dividing numbers %d and %d is %d! The remainder is %d! \n",
                a, b, divideMethod(a, b), remainderMethod(a, b));
    }
}
