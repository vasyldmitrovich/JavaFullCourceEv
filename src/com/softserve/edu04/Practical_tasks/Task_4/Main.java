package com.softserve.edu04.Practical_tasks.Task_4;

public class Main {
    public static void main(String[] args) {
        Product yogurt = new Product("yogurt", 1.2f, 5);
        Product meat = new Product("meat", 5f, 25);
        Product cheese = new Product("cheese", 5.5f, 20);
        Product porridge = new Product("yogurt", 2.8f, 10);

        yogurt.mostExpensiveItem(meat, cheese, porridge);
        yogurt.biggestQuantity(meat, cheese, porridge);
    }
}