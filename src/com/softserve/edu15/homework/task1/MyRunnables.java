package com.softserve.edu15.homework.task1;

public class MyRunnables {
    private volatile boolean isFirstThreadCompleted = false;
    private volatile boolean isSecondThreadCompleted = false;

    public MyRunnables() {
    }

    public boolean isFirstThreadCompleted() {
        return isFirstThreadCompleted;
    }

    public void setFirstThreadCompleted(boolean firstThreadCompleted) {
        isFirstThreadCompleted = firstThreadCompleted;
    }

    public boolean isSecondThreadCompleted() {
        return isSecondThreadCompleted;
    }

    public void setSecondThreadCompleted(boolean secondThreadCompleted) {
        isSecondThreadCompleted = secondThreadCompleted;
    }

    synchronized public void outFirstThread() {
        for(int i = 0; i < 5; i++) {
            System.out.println("The first thread");
        }
        setFirstThreadCompleted(true);
        notify();
    }

    synchronized public void outSecondThread() {
        for(int i = 0; i < 5; i++) {
            System.out.println("The second thread");
        }
        setSecondThreadCompleted(true);
        notify();
    }

    synchronized public void outThirdThread(){
        while (!isFirstThreadCompleted() || !isSecondThreadCompleted()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("The third thread");
        }
    }
}
