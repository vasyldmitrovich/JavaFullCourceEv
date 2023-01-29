package com.softserve.edu04.practical.task4;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        new Product("Apple", 1500.9, 50);
        Product product2 = new Product("Samsung", 1250.5);
        Product product3 = new Product("Huawei");
        Product product4 = new Product();

        product2.setQuantity((int) (Math.random()*99)+1);
        product3.setQuantity((int) (Math.random()*99)+1);
        product3.setPrice((Math.random()*1000)+1000);
        System.out.println("\nPlease enter the name of Product #4:");
        product4.setName(new Scanner(System.in).nextLine());
        product4.setQuantity((int) (Math.random()*99)+1);
        product4.setPrice((Math.random()*1000)+1000);

        System.out.println("\nPriceList:");
        Product.allPrices();
        System.out.println("\nInventory results:");
        Product.allQuantities();

        System.out.println("\nMost expensive product is - " + Product.mostExpensive());
        System.out.println("\nMost quantity product is - " + Product.mostQuantity());
    }
}
