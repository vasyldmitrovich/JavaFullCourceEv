package com.softserve.edu14.homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(7);
        fillListOfEmployees(list);

        Optional<String> name = mostPopularName(list);
        System.out.println("Most popular name: " + name.orElse(null));
    }

    public static void fillListOfEmployees(List<Employee> list){
        list.add(new Employee("Orest"));
        list.add(new Employee(null));
        list.add(new Employee("Anna"));
        list.add(new Employee("Orest"));
        list.add(new Employee("Dima"));
        list.add(new Employee("Anna"));
        list.add(new Employee("Orest"));
    }

    public static Optional<String> mostPopularName(List<Employee> employees){
        Optional<String> popularName = Optional.empty();

        if (!employees.isEmpty()) {
            List<Employee> uniqueNames = employees.stream().filter(x -> x.getName() != null).distinct().toList();

            long max = 0;
            long count;

            for (Employee uniqueName : uniqueNames) {
                count = employees.stream()
                        .filter(x -> x.getName() != null)
                        .filter(name -> name.getName().equals(uniqueName.getName()))
                        .count();

                if (max < count) {
                    max = count;
                    popularName = Optional.of(uniqueName.getName());
                }
            }

        }
        return popularName;
    }
}
