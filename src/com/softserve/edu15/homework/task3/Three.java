package com.softserve.edu15.homework.task3;

public class Three extends Thread {
    private final String text = "Thread number " + getClass().getSimpleName().toLowerCase();
    private final int quantity = 5;

    @Override
    public void run() {
        for (int i = 0; i < quantity; i++) {
            System.out.println(text);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
