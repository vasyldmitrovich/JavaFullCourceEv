package com.softserve.edu15.homework.task3;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        Thread two = new MyThread2();
        two.start();
    }
}
