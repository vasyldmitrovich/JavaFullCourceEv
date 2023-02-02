package com.softserve.edu05.Practical_tasks.Task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee emp_1 = new Employee("Marian", 1234, 3600);
        Employee emp_2 = new Employee("Ivan", 1001, 2800);
        Employee emp_3 = new Employee("Oleh", 1234, 3200);
        Employee emp_4 = new Employee("Stas", 7777, 3000);
        Employee emp_5 = new Employee("Igor", 7777, 2800);

        Employee[] emps = {emp_1, emp_2, emp_3, emp_4, emp_5};

        System.out.print("Enter the department number: ");
        int dep_num = scan.nextInt();
        boolean same_dep = false;

        for(int i = 0; i < emps.length; i++){
            if(emps[i].getDepartment_number() == dep_num) {
                System.out.println("This employee has the same number: " + emps[i].getName());
                same_dep = true;
            }
        }

        if(!same_dep)
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
            emps[i].print();
        }

    }
}
