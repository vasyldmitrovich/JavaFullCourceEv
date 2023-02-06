package com.softserve.edu06.hw.task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle("brown", 2, 100, 3000),
                        new Swallow("BRW", 3, 160, 80),
                        new Penguin("black-white", 4, 8, 11),
                        new Chicken("different", 10, 14, 130)};
        for (Bird temp: birds) {
            temp.fly();
            System.out.println(", my feathers - " + temp.getFeathers() + ", i can lay eggs - " + temp.getLayEggs());
        }
    }
}
