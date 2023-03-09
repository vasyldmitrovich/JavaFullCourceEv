package com.softserve.edu13.practical.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        run1();
        System.out.println();
        run2();
        System.out.println();
        run3();
    }

    public static void run1() {
        List<String> cars = createList();
        newSort(cars);
        cars.forEach(System.out::println);
    }
    public static void run2() {
        List<String> cars = createList();
        cars.stream().sorted().forEach(System.out::println);
    }

    public static void run3() {
        List<String> cars = createList();
        Collections.sort(cars);
        cars.forEach(System.out::println);
    }

    public static List<String> createList() {
        List<String> names = new ArrayList<>();
        names.add("BMW");
        names.add("Lincoln");
        names.add("Toyota");
        names.add("Dodge");
        names.add("Nissan");
        names.add("Buick");
        names.add("Ford");
        return names;
    }
    public static void newSort(List<String> list) {
        list.sort(String::compareTo);
    }
}
