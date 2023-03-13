package com.softserve.edu15.homework.task3;

public class One extends Thread{
    @Override
    public void run() {
        Thread second = new Two();
        second.start();
    }
}
