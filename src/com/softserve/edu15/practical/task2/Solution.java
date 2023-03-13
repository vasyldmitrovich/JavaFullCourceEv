package com.softserve.edu15.practical.task2;

public class Solution {
    private static final String message1 = "Hello, world";
    private static final String message2 = "Peace in the peace";
    private static final String message3 = "My name is Yaroslav";
    private static int quantity;
    private static int delay;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        printMessageWithDelay(message1, 5, 2000);
        printMessageWithDelay(message2, 5, 3000);
        printMessageWithDelay(message3, 1, 0);
    }

    public static void printMessageWithDelay (String string, int quantity, int delay) {
        for (int i = 0; i < quantity-1; i++) {
            System.out.println(string);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(string);
    }
}
