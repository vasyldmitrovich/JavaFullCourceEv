package com.softserve.edu15.homework.task2;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread start");

        while(!Main.isThreadCompleted){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
        }

        System.out.println("MyThread finished");
    }
}
