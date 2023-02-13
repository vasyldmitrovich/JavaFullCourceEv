package com.softserve.edu03.practicalTask;

import java.util.Arrays;

public class MainEmploy {
    public static void main(String[] args) {
        Employee em0 = new Employee("Olga", 165f);
        Employee em1 = new Employee("Vita", 170f);
        Employee em2 = new Employee("Vira", 120f);

        em0.setRate(70.8f);
        em1.setRate(70.8f);
        em2.setRate(70.8f);

        System.out.println(em0);

        for (Employee employee : Arrays.asList(em1, em2)) {
            System.out.println(employee);
        }

        System.out.println("\nInformation about employee");
        System.out.println(em0.getName() + " - " + "Your salary with bonuses 10% " +
                (em0.getSalary() + (em0.getSalary() * 0.1f)));
        System.out.println(em1.getName() + " - " + "Your salary with bonuses 10% " +
                (em1.getSalary() + (em1.getSalary() * 0.1f)));
        System.out.println(em2.getName() + " - " + "Your salary with bonuses 10% " +
                (em2.getSalary() + (em2.getSalary() * 0.1f)));

        System.out.println("\nTotal salary of all workers is " + (em0.getSalary() + em1.getSalary() +
                em2.getSalary())); //загальна зарплата всіх працівників


    }
}
