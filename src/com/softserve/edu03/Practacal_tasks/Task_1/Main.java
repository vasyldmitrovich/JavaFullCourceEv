package com.softserve.edu03.Practacal_tasks.Task_1;

import com.softserve.edu03.Practacal_tasks.Task_1.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Marian");
        employee1.setRate(36.6f);
        employee1.setHours(120);

        Employee employee2 = new Employee("Ivan");
        employee2.setRate(30f);
        employee2.setHours(140);

        Employee employee3 = new Employee("Johan", 41.25f, 100);

        System.out.println("\nInformation about employees\n");
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

        System.out.println("Number of employee: " + Employee.getTotalSum());
    }
}
