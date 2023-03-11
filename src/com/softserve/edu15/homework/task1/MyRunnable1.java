package com.softserve.edu15.homework.task1;

public class MyRunnable1 implements Runnable {
    MyRunnables myRunnables;

    public MyRunnable1() {
    }

    public MyRunnable1(MyRunnables myRunnables) {
        this.myRunnables = myRunnables;
    }

    @Override
    public void run() {
        myRunnables.outFirstThread();
    }
}
