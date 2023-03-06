package com.softserve.edu15.dialog;

public class App {
    public static void main(String[] args) {
        DialogTime dt = new DialogTime();
        dt.setVisible(true);
        System.out.println("main(): Thread ID = " + Thread.currentThread().getId());
    }
}