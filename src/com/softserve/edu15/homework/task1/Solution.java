package com.softserve.edu15.homework.task1;

public class Solution {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Text firstMessage = new Text("Message1",5);
        Thread thread1 = new Thread(firstMessage);
        Text secondMessage = new Text("Message2",5);
        Thread thread2 = new Thread(secondMessage);
        Text thirdMessage = new Text("Message3",5);
        Thread thread3 = new Thread(thirdMessage);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
