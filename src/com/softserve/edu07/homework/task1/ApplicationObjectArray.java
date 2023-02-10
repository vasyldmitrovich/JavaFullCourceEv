package com.softserve.edu07.homework.task1;

import java.util.Arrays;
import java.util.Comparator;

public class ApplicationObjectArray {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("\nNon-sorted list of employees:");
        printAllInfo(createAllEmployee());
        System.out.println("\nSorted list of employees:");
        printAllInfo(sort(createAllEmployee()));
    }


    public static Object[] createAllEmployee() {
        Employee[] allEmployee = {
                new ContractEmployee("Yaroslav", "161106-4963", "VICW120621HOAEOON1", 40000),
                new ContractEmployee("Oleh", "960726+6492", "SOYG540721MDGUII07", 70000),
                new SalariedEmployee("Max", "460930-6818", "S2878889H", 750, 160),
                new SalariedEmployee("Peter", "200829+7919", "T9593944H", 1000, 160)
        };
        return allEmployee;
    }


    public static void printAllInfo(Object[] objects) {
        for (Object object : objects) {
            System.out.print(object);
            if (object instanceof ContractEmployee employee) {
                System.out.println(employee.calculatePay());
            }
            if (object instanceof SalariedEmployee employee) {
                System.out.println(employee.calculatePay());
            }

        }
    }

    public static Object[] sort(Object[] objects) {
        Comparator<Object> comparator = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                int result=0;
                if (o1 instanceof Employee employee1 && o2 instanceof Employee employee2) {
                    result = -employee1.calculatePay() - employee2.calculatePay();
                }
                return result;
            }
        };
            Arrays.sort(objects, comparator);
            return objects;
    }
}

