package com.softserve.edu04.practicalTasks.task4;

public class Main {
    public static void main(String[] args) {
        Product yogurt = new Product("yogurt", 1.2f, 5);
        Product meat = new Product("meat", 5f, 25);
        Product cheese = new Product("cheese", 5.5f, 20);
        Product porridge = new Product("yogurt", 2.8f, 10);

        yogurt.getMostExpensiveItem(meat, cheese, porridge);
        yogurt.getBiggestQuantity(meat, cheese, porridge);
    }
}
