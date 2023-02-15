package com.softserve.edu07.homework.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employees[] = {
                new SalariedEmployee("Ivan", "XYZ0106201201", 10, 160, "123-23-4578"),
                new SalariedEmployee("Taras", "XYZ0106198502", 8, 180, "202-21-8844"),
                new ContractEmployee("Igor", "XYZ0106306234", 2000, "900-45-5566"),
                new ContractEmployee("Marian", "XYZ0106244109", 2400, "963-01-7654")
        };

        Arrays.sort(employees);

        System.out.println("\n--Array of employees sorted by salary ");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
