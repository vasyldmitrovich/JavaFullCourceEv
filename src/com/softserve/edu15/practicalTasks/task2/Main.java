package com.softserve.edu15.practicalTasks.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread1();
        Thread thread2 = new MyThread2();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("\nMy name is Marian :)");
    }
}
