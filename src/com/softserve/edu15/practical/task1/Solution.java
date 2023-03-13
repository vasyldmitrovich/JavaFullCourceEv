package com.softserve.edu15.practical.task1;

public class Solution {
    private static final String text = "I study Java";

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(text);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
