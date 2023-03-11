package com.softserve.edu14.homework.task1;

import java.time.LocalDate;

public class Product {
    private String category;
    private LocalDate date;
    private int price;

    public Product() {
    }

    public Product(String category, LocalDate date, int price) {
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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
        return "\nCategory: " + category
                + "\nDate: " + date
                + "\nPrice: " + price;
    }
}
