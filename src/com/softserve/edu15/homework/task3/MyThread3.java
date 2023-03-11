package com.softserve.edu15.homework.task3;

public class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number three");
        }
    }
}
