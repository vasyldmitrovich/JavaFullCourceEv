package com.softserve.edu06.homework.task1;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle(4, "brown", 120, 1000, 7);
        Bird swallow = new Swallow(3, "beautiful", 20, 20, true);
        Bird penguin = new Penguin(1, "black and white", 7, 3, 500);
        Bird chicken = new Chicken(2, "dark", 12, 1, false);

        Bird birds[] = {eagle, swallow, penguin, chicken};

        for (int i = 0; i < birds.length; i++){
            System.out.println(birds[i].toString());
            birds[i].fly();
        }
    }
}
