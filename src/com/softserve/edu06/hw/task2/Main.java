package com.softserve.edu06.hw.task2;

public class Main {
    public static void main(String[] args) {
        Employee first = new Employee("Vasya", 25, 40000);
        Developer second = new Developer("Petya", 24, 41000, "trainee");
        System.out.println(first.report());
        System.out.println(second.report());
    }
}
