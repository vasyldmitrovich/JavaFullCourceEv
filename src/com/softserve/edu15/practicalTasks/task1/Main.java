package com.softserve.edu15.practicalTasks.task1;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
