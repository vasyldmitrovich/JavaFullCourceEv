package com.softserve.edu14.hw.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Bob"));
        list.add(new Employee("Sam"));
        list.add(new Employee("Red"));
        list.add(new Employee("Rob"));
        list.add(new Employee("Bob"));
        list.add(new Employee("Sam"));
        list.add(new Employee("John"));
        list.add(new Employee("Jack"));
        list.add(new Employee("Sam"));

        System.out.println(mostPopularName(list.stream()));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        // Find the most popular name
        return nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}