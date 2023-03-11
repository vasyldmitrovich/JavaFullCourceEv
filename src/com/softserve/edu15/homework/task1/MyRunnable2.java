package com.softserve.edu15.homework.task1;

public class MyRunnable2 implements Runnable {
    MyRunnables myRunnables;

    public MyRunnable2() {
    }

    public MyRunnable2(MyRunnables myRunnables) {
        this.myRunnables = myRunnables;
    }

    @Override
    public void run() {
        myRunnables.outSecondThread();
    }
}
