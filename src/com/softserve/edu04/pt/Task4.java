package com.softserve.edu04.pt;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Product bike = new Product("Bike", 300, 5);
        Product phone = new Product("Mobile phone", 400, 3);
        Product dishes = new Product("Dishes", 200, 7);
        Product book = new Product("Book", 100, 15);
        List<Product> products = new ArrayList<>();
        products.add(bike);
        products.add(phone);
        products.add(dishes);
        products.add(book);
        Product expensive = new Product("Expensive", 0, 0);
        Product many = new Product("Many", 0, 0);
        for (Product product: products) {
            if(product.getPrice() > expensive.getPrice()) expensive = product;
            if(product.getQuantity() > many.getQuantity()) many = product;
        }
        System.out.println("most expensive product - " + expensive);
        System.out.println("item with the most quantity - " + many);
    }
}

class Product{
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
