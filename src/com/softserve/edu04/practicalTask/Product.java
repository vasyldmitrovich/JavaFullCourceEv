package com.softserve.edu04.practicalTask;

import java.util.Comparator;

public class Product {// extends Object {

    private String fieldsName;
    private static int count; //  = 0;
    private int price;
    private int quantity;

    static {
        count = 0;
    }

    public Product() {
        fieldsName = "";
        count++;
        price = 0;
        quantity =0;
    }

    public Product(String fieldsName, int price, int quantity) {
        this();
        this.fieldsName = fieldsName;
        this.price = price;
        this.quantity = quantity;
    }

    public static int getCount() {
        return count;
    }

    public String getFieldsName() {
        return fieldsName;
    }
    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFieldsName(String fieldsName) {
        this.fieldsName = fieldsName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   /* public void setQuantity(){
        this.quantity = quantity;
    }*/

    @Override
    public String toString() {
        return "Product{" + fieldsName +
                "price=" + price +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}

