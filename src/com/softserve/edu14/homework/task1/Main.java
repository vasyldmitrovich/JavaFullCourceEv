package com.softserve.edu14.homework.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(20);
        fillListOfProducts(list);
        mySort(list);
    }

    public static void fillListOfProducts(List<Product> list){
        list.add(new Product("TV", LocalDate.of(2010, 4, 1), 1500));
        list.add(new Product("Phone", LocalDate.of(2018, 2, 1), 2400));
        list.add(new Product("Keyboard", LocalDate.of(2010, 6, 1), 500));
        list.add(new Product("Monitor", LocalDate.of(2020, 1, 1), 5000));
        list.add(new Product("Game console", LocalDate.of(2004, 7, 1), 700));

        list.add(new Product("Monitor", LocalDate.of(2017, 11, 1), 3000));
        list.add(new Product("TV", LocalDate.of(2015, 5, 1), 2000));
        list.add(new Product("Keyboard", LocalDate.of(2013, 4, 1), 800));
        list.add(new Product("TV", LocalDate.of(2018, 12, 1), 4000));
        list.add(new Product("Monitor", LocalDate.of(2022, 3, 1), 10000));

        list.add(new Product("Game console", LocalDate.of(2021, 9, 1), 7000));
        list.add(new Product("Phone", LocalDate.of(2023, 3, 1), 12000));
        list.add(new Product("Keyboard", LocalDate.of(2019, 2, 1), 2200));
        list.add(new Product("Phone", LocalDate.of(2022, 1, 1), 8900));
        list.add(new Product("Game console", LocalDate.of(2018, 8, 1), 3600));

        list.add(new Product("TV", LocalDate.of(2021, 10, 1), 5500));
        list.add(new Product("Keyboard", LocalDate.of(2018, 4, 1), 2100));
        list.add(new Product("Monitor", LocalDate.of(2020, 2, 1), 6400));
        list.add(new Product("Phone", LocalDate.of(2017, 12, 1), 5000));
        list.add(new Product("Game console", LocalDate.of(2015, 6, 1), 1800));
    }

    public static void mySort(List<Product> list){
        list = list.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDate().plusYears(1).isBefore(LocalDate.now()))
                .sorted(Comparator.comparingInt(Product::getPrice))
                .toList();

        System.out.println("\nSorted list of products: ");
        list.forEach(System.out::println);
    }
}
