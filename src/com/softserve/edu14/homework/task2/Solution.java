package com.softserve.edu14.homework.task2;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        // create list of employees
        List<Employee> employees = createList();
        System.out.println();
        // display original list
        employees.forEach(System.out::println);
        // create a map with duplicated names
        Map<Integer, String> info = duplicatedElements(employees);
        // Display map - key is an appearance frequency, value is a name
        System.out.println();
        System.out.println(info);
        // get most popular name and it's frequency
        displayNameAndFrequency(info);

    }
    public static List<Employee> createList() {
        List<Employee> list = new ArrayList<>(10);
        list.add(new Employee("Bob"));
        list.add(new Employee("Din"));
        list.add(new Employee("Din"));
        list.add(new Employee("Sam"));
        list.add(new Employee("Bob"));
        list.add(new Employee("Bob"));
        list.add(new Employee("Sam"));
        list.add(new Employee("Sam"));
        list.add(new Employee("Sam"));
        return list;
    }

    public static Map<Integer, String> duplicatedElements(List<Employee> employees) {
        List<String> names = employees.stream().map(Employee::getName).toList();
         Map<Integer, String> map = new HashMap<>();
         for (var name : names) {
             int key = 0;
             for (var element : names) {
                 if (name.equals(element)) {
                     key++;
                 }
             }
             if (key > 1) {
                 map.put(key,name);
             }
         } return map;
    }

    public static void displayNameAndFrequency (Map<Integer, String> duplicatedElements) {
        Set<Integer> elements = duplicatedElements.keySet();
        TreeSet<Integer> keys = new TreeSet<>(elements);
        int maxAppearances = keys.last();
        String mostPopularName =  duplicatedElements.get(maxAppearances);
        System.out.println("Most popular name is - " + mostPopularName + ". I find it - " + maxAppearances + " times!");
    }
}
