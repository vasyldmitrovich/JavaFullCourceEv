package com.softserve.edu15.homework.task2;

public class Main {
    public static boolean isThreadCompleted = false;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");

        Thread thread = new MyThread();
        thread.start();
        thread.join();

        isThreadCompleted = true;
        System.out.println("Main finished...");
    }
}
