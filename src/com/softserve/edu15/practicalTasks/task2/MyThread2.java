package com.softserve.edu15.practicalTasks.task2;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Peace in the peace");
        }
    }
}
