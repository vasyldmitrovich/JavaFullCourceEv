package com.softserve.edu04.practical.task4;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private static final ArrayList<Product> allProducts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product() {
        allProducts.add(this);
    }

    public Product(String name) {
        this();
        this.name = name;
    }

    public Product(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static String mostExpensive () {
        double max = allProducts.get(0).getPrice();
        String name = allProducts.get(0).getName();
        for (Product product : allProducts) {
            if (product.getPrice() > max) {
                max = product.getPrice();
                name = product.getName();
            }
        }
        return name;
    }
    public static String mostQuantity () {
        int max = allProducts.get(0).getQuantity();
        String name = allProducts.get(0).getName();
        for (Product product : allProducts) {
            if (product.getQuantity() > max) {
                max = product.getQuantity();
                name = product.getName();
            }
        }
        return name;
    }

    public static void allPrices () {
        for (Product product : allProducts) {
            System.out.printf("%s - %.2f$ per piece\n", product.getName(),product.getPrice());
        }
    }

    public static void allQuantities () {
        for (Product product : allProducts) {
            System.out.println(product.getName() + " - " + product.getQuantity() + " pieces");
        }
    }
}
