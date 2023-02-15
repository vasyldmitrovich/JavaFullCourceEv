package com.softserve.edu05.practicalTasks.task2;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Employee emp1 = new Employee("Marian", 1234, 3600);
        Employee emp2 = new Employee("Ivan", 1001, 2800);
        Employee emp3 = new Employee("Oleh", 1234, 3200);
        Employee emp4 = new Employee("Stas", 7777, 3000);
        Employee emp5 = new Employee("Igor", 7777, 2800);

        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};

        /*Create a separate method that accepts a string and prints a message, and then returns the data entered by the user*/
        int depNumber = getValue();
        boolean isSameDepNumber = false;

        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == depNumber) {
                System.out.println("This employee has the same number: " + employee.getName());
                isSameDepNumber = true;
            }
        }

        if(!isSameDepNumber) {
            System.out.println("No employee has such a number...");
        }

        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) { // Bubble sort
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }

        System.out.println("\nSalary of workers from higher to lower: ");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int getValue(){
        System.out.print("Enter the department number: ");
        return scan.nextInt();
    }
}
