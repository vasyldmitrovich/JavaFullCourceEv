package com.softserve.edu07.homework.task1;

import java.util.Arrays;
import java.util.Comparator;

public class ApplicationEmployeeArray {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("\nNon-sorted list of employees:");
        printAllInfo(createAllEmployee());
        System.out.println("\nSorted list of employees:");
        printAllInfo(sort(createAllEmployee()));
    }


    public static Employee[] createAllEmployee() {
        Employee[] allEmployee = {
                new ContractEmployee("Yaroslav", "161106-4963", "VICW120621HOAEOON1", 40000),
                new ContractEmployee("Oleh", "960726+6492", "SOYG540721MDGUII07", 70000),
                new SalariedEmployee("Max", "460930-6818", "S2878889H", 750, 160),
                new SalariedEmployee("Peter", "200829+7919", "T9593944H", 1000, 160)
        };
        return allEmployee;
    }


    public static void printAllInfo(Employee[] employees) {
        for (Employee person : employees) {
            System.out.print(person);
            if (person instanceof ContractEmployee employee) {
                System.out.println(employee.calculatePay());
            }
            if (person instanceof SalariedEmployee employee) {
                System.out.println(employee.calculatePay());
            }

        }
    }

    public static Employee[] sort(Employee[] employees) {
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return -employee1.calculatePay() - employee2.calculatePay();
            }
        };
        Arrays.sort(employees, comparator);
        return employees;
    }
}
