package com.softserve.edu17teamWork;

public class Task7 {
    public static void run(int n){
        int factorial = 1;
        for (int i = 0; i < n; i++) {
            factorial *= i + 1;
        }
        System.out.println("n = " + n);
        System.out.println("!n = " + factorial);
    }
}
