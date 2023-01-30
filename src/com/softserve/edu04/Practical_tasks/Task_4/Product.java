package com.softserve.edu04.Practical_tasks.Task_4;

public class Product {
    String name;
    float price;
    int quantity;

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void mostExpensiveItem(Product prod_1, Product prod_2, Product prod_3) {
        System.out.println("--The most expensive item");
        if (prod_1.price <= this.price && prod_2.price <= this.price && prod_3.price <= this.price)
            System.out.println("Name: " + this.name + "\nQuantity: " + this.quantity);
        else if (this.price <= prod_1.price && prod_2.price <= prod_1.price && prod_3.price <= prod_1.price)
            System.out.println("Name: " + prod_1.name + "\nQuantity: " + prod_1.quantity);
        else if (this.price <= prod_2.price && prod_1.price <= prod_2.price && prod_3.price <= prod_2.price)
            System.out.println("Name: " + prod_2.name + "\nQuantity: " + prod_2.quantity);
        else
            System.out.println("Name: " + prod_3.name + "\nQuantity: " + prod_3.quantity);
    }

    public void biggestQuantity(Product prod_1, Product prod_2, Product prod_3) {
        System.out.println("\n--The biggest quantity item");
        if (prod_1.price <= this.quantity && prod_2.quantity <= this.quantity && prod_3.quantity <= this.quantity)
            System.out.println("Name: " + this.name + "\nPrice: " + this.price);
        else if (this.quantity <= prod_1.quantity && prod_2.quantity <= prod_1.quantity && prod_3.quantity <= prod_1.quantity)
            System.out.println("Name: " + prod_1.name + "\nPrice: " + prod_1.price);
        else if (this.quantity <= prod_2.quantity && prod_1.quantity <= prod_2.quantity && prod_3.quantity <= prod_2.quantity)
            System.out.println("Name: " + prod_2.name + "\nPrice: " + prod_2.price);
        else
            System.out.println("Name: " + prod_3.name + "\nPrice: " + prod_3.price);
    }
}
