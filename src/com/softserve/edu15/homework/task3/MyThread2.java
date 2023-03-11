package com.softserve.edu15.homework.task3;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");
        }
        Thread three = new MyThread3();
        three.start();
    }
}
