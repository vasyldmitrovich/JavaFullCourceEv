package com.softserve.edu03.pt;

public class Main {
    public static void main(String[] args) {
        Employee first = new Employee("Sam", 15, 35);
        Employee second = new Employee("Rick", 12, 40);
        Employee third = new Employee("Johm");
        third.setRate(14);
        third.setHours(38);

        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());

        int totalSalary = first.getSalary() + first.getBonuses() + second.getSalary() + second.getBonuses() + third.getSalary() + third.getBonuses();
        System.out.println("Total salary = " + totalSalary);
    }
}