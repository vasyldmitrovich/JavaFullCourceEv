package com.softserve.edu14.homework.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        // Create list Product with 20 objects
        List<Product> products = createList();
        System.out.println("Here we got a list of products:\n");
        products.forEach(System.out::println);

        /* Obtain a sorted by the price list of products belong to category Phone with
           price > 3000, and the date of manufacture was more than 1 year ago. */

        List<Product> specialProduct = products
                .stream()
                .filter(element -> element.getCategory().equals("Phone"))
                .filter(element -> element.getDate().isBefore(LocalDate.now().minusYears(1)))
                .filter(element -> element.getPrice() > 3000)
                .toList();
        System.out.println("\nHere we got a non-sorted list of products according task:\n");
        specialProduct.forEach(System.out::println);

        // Sorted list by price
        System.out.println("\nHere we got a sorted list of products by price:\n");
        specialProduct
                .stream()
                .sorted(Comparator.comparingInt(Product::getPrice))
                .forEach(System.out::println);

        // Sorted list by date of production
        System.out.println("\nHere we got a sorted list of products by date of production:\n");
        specialProduct
                .stream()
                .sorted(Comparator.comparing(Product::getDate))
                .forEach(System.out::println);
    }
    public static List<Product> createList() {
        List <Product> list = new ArrayList<>(24);
        list.add(new Product("Computer",LocalDate.of(2022,1,1),(int) (Math.random()*2000+2000)));
        list.add(new Product("Phone",LocalDate.of(2021,2,2),(int) (Math.random()*2000+2000)));
        list.add(new Product("VR",LocalDate.of(2020,3,3),(int) (Math.random()*2000+2000)));
        list.add(new Product("PlayStation",LocalDate.of(2019,4,4),(int) (Math.random()*2000+2000)));
        list.add(new Product("Computer",LocalDate.of(2022,5,5),(int) (Math.random()*2000+2000)));
        list.add(new Product("Phone",LocalDate.of(2021,6,6),(int) (Math.random()*2000+2000)));
        list.add(new Product("VR",LocalDate.of(2020,7,7),(int) (Math.random()*2000+2000)));
        list.add(new Product("PlayStation",LocalDate.of(2019,8,8),(int) (Math.random()*2000+2000)));
        list.add(new Product("VR",LocalDate.of(2022,9,9),(int) (Math.random()*2000+2000)));
        list.add(new Product("Computer",LocalDate.of(2021,10,10),(int) (Math.random()*2000+2000)));
        list.add(new Product("PlayStation",LocalDate.of(2020,11,11),(int) (Math.random()*2000+2000)));
        list.add(new Product("Phone",LocalDate.of(2019,12,12),(int) (Math.random()*2000+2000)));
        list.add(new Product("Phone",LocalDate.of(2022,12,13),(int) (Math.random()*2000+2000)));
        list.add(new Product("VR",LocalDate.of(2021,11,14),(int) (Math.random()*2000+2000)));
        list.add(new Product("Computer",LocalDate.of(2020,10,15),(int) (Math.random()*2000+2000)));
        list.add(new Product("PlayStation",LocalDate.of(2019,9,16),(int) (Math.random()*2000+2000)));
        list.add(new Product("PlayStation",LocalDate.of(2022,8,17),(int) (Math.random()*2000+2000)));
        list.add(new Product("Computer",LocalDate.of(2021,7,18),(int) (Math.random()*2000+2000)));
        list.add(new Product("VR",LocalDate.of(2020,6,19),(int) (Math.random()*2000+2000)));
        list.add(new Product("Phone",LocalDate.of(2019,5,20),(int) (Math.random()*2000+2000)));
        list.add(new Product("Computer",LocalDate.of(2022,4,21),(int) (Math.random()*2000+2000)));
        list.add(new Product("PlayStation",LocalDate.of(2021,3,22),(int) (Math.random()*2000+2000)));
        list.add(new Product("Phone",LocalDate.of(2020,2,23),(int) (Math.random()*2000+2000)));
        list.add(new Product("VR",LocalDate.of(2019,1,24),(int) (Math.random()*2000+2000)));
        return list;
    }

}
