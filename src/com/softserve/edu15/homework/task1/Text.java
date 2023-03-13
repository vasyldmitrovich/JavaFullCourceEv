package com.softserve.edu15.homework.task1;

public class Text implements Runnable{
    private String message;
    private int quantity;

    public Text(String message, int quantity) {
        this.message = message;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        for (int i = 0; i < quantity; i++) {
            System.out.println(message);
        }
    }
}
