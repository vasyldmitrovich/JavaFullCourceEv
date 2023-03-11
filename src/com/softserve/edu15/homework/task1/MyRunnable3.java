package com.softserve.edu15.homework.task1;

public class MyRunnable3 implements Runnable {
    MyRunnables myRunnables;

    public MyRunnable3() {
    }

    public MyRunnable3(MyRunnables myRunnables) {
        this.myRunnables = myRunnables;
    }

    @Override
    public void run() {
        myRunnables.outThirdThread();
    }
}
