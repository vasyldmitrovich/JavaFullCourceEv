package com.softserve.edu15.homework.task3;

public class Solution {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Thread first = new One();
        first.start();
    }
}
