package com.softserve.edu15.homework.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRunnables myRunnables = new MyRunnables();

        Runnable r1 = new MyRunnable1(myRunnables);
        Thread thread1 = new Thread(r1);

        Runnable r2 = new MyRunnable2(myRunnables);
        Thread thread2 = new Thread(r2);

        Runnable r3 = new MyRunnable3(myRunnables);
        Thread thread3 = new Thread(r3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
