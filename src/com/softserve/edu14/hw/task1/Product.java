package com.softserve.edu14.hw.task1;

import java.util.Date;

public class Product {
    private Category category;
    private Date date;
    private int price;

    public Product() {
    }

    public Product(Category category, Date date, int price) {
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", date=" + (date.getYear()+1900) +
                ", price=" + price +
                '}';
    }
}
