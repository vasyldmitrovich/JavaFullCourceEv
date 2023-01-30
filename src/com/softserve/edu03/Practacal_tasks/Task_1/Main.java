package com.softserve.edu03.Practacal_tasks.Task_1;

import com.softserve.edu03.Practacal_tasks.Task_1.Employee;

public class Main {
    public static void main(String[] args) {
        Employee person_1 = new Employee();
        person_1.setName("Marian");
        person_1.setRate(36.6f);
        person_1.setHours(120);

        Employee person_2 = new Employee("Ivan");
        person_2.setRate(30f);
        person_2.setHours(140);

        Employee person_3 = new Employee("Johan", 41.25f, 100);

        System.out.println("\nInformation about employees\n");
        System.out.println(person_1.toString());
        System.out.println(person_2.toString());
        System.out.println(person_3.toString());

        System.out.println("Number of employee: " + Employee.getTotalSum());
    }
}
