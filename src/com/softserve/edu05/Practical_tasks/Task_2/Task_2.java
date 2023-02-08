package com.softserve.edu05.Practical_tasks.Task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee emp1 = new Employee("Marian", 1234, 3600);
        Employee emp2 = new Employee("Ivan", 1001, 2800);
        Employee emp3 = new Employee("Oleh", 1234, 3200);
        Employee emp4 = new Employee("Stas", 7777, 3000);
        Employee emp5 = new Employee("Igor", 7777, 2800);

        Employee[] emps = {emp1, emp2, emp3, emp4, emp5};
        /*Create a separate method that accepts a string and prints a message, and then returns the data entered by the user*/
        System.out.print("Enter the department number: ");
        int depNum = scan.nextInt();
        boolean sameDep = false;

        for(int i = 0; i < emps.length; i++){
            if(emps[i].getDepartmentNumber() == depNum) {
                System.out.println("This employee has the same number: " + emps[i].getName());
                sameDep = true;
            }
        }

        if(!sameDep)
            System.out.println("No employee has such a number...");

        Employee tmp;
        for (int i = 0; i < emps.length - 1; i++) { // Bubble sort
            for (int j = i + 1; j < emps.length; j++) {
                if (emps[i].getSalary() < emps[j].getSalary()) {
                    tmp = emps[i];
                    emps[i] = emps[j];
                    emps[j] = tmp;
                }
            }
        }

        System.out.println("\nSalary of workers from higher to lower: ");

        for (int i = 0; i < emps.length; i++){
            System.out.println(emps[i].toString());
        }
    }
}
