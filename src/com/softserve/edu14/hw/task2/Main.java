package com.softserve.edu14.hw.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static int a;
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
        Set<String> set = employees.map(x -> x.getName()).collect(Collectors.toSet());
        if(employees.count() == 0 || employees.count() == set.size()) return Optional.empty();
        Map<String, Long> map = new HashMap<>();
        for (String tmp: set) {
            map.put(tmp, employees.filter(x -> x.getName().equals(tmp)).count());
        }
        for (Map.Entry tmp: map.entrySet()) {
            if((int)tmp.getValue() > a) a = (int) tmp.getValue();
        }
        List<String> list = map.entrySet().stream().filter(x -> x.getValue() == (long)a).map(x -> x.getKey()).collect(Collectors.toList());
        Optional<String> result = list.stream().reduce((x,y) -> x + "; " + y);
        return result;
    }
}