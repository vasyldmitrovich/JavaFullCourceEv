package com.softserve.edu05.practical.task2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private String name;
    private String department;
    private int salary;
    private static final ArrayList<Employee> allEmployees = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartmentNumber(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public Employee() {
        allEmployees.add(this);
    }

   /* public Employee(String name, String department, int salary) {
        this();
        this.name = name;
        this.department = department;
        this.salary = salary;
    }*/

    public static int amountOfEmployees() {
        System.out.println("Please enter the amount of employees you want to create: ");
        int result = 0;
        while (result <= 0 || result > 10) {
            try {
                result = new Scanner (System.in).nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("You input not Integer. Please try again input correct data!");
            }
            if (result < 0) {
                System.out.println("Number of employees can not be negative!");
            }
            if (result == 0) {
                System.out.println("We can not work with 0 employees!");
            }
            if (result > 10) {
                System.out.println("Wow, slow down, we don't have a salary budget for "
                        + result + " employees. Please choose an integer between 1 and 10!");
            }
        }
        return result;
    }

    public static void createEmployees(int n) {
        for (int i = 1; i <= n; i++) {
            new Employee();
        }
    }

    public static void setAllNames() {
        int count = 0;
        for (Employee employee : allEmployees) {
            System.out.println("Please enter the name for employee #" + ++count + " :");
            String name = "";
            while (name == null || name.equals("")) {
                name = new Scanner(System.in).nextLine();
                if (name == null || name.equals("")) {
                    System.out.println("Please enter the correct name!");
                }
            }
            employee.setName(name);
        }
    }

    public static void setAllDepartments() {
        for (Employee employee : allEmployees) {
            int departmentID = ((int) (Math.random() * 3) + 1);
            if (departmentID == 1) {
                employee.setDepartmentNumber("Production");
            } else if (departmentID == 2) {
                employee.setDepartmentNumber("Logistics");
            } else {
                employee.setDepartmentNumber("Accounting");
            }
        }
    }

    public static void setAllSalaries() {
        for (Employee employee : allEmployees) {
            employee.setSalary((int) (Math.random() * 40001 + 10000));
        }

    }


    public static void print() {
        System.out.println(allEmployees.toString());
    }

    public static String chooseDepartment() {
        System.out.println("\nHere is a ID of each department: ");
        System.out.println("1 - Production department,\n2 - Logistic department,\n3 - Accounting department\n");
        System.out.println("Enter the number of department to display list of it employees: ");
        int number = 0;
        while (number <= 0 || number > 3) {
            try {
                number = new Scanner(System.in).nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("You input not Integer. Please try again input correct data!");
            }
            if (number <= 0 || number > 3) {
                System.out.println("We have only 3 departments. Please try again input correct data!");
            }
        }
        if (number == 1) return "Production";
        if (number == 2) return "Logistic";
        else return "Accounting";
    }

    public static void departmentSearch(String department) {
        for (int i = 0; i < allEmployees.size(); i++) {
            if (allEmployees.get(i).getDepartment().equalsIgnoreCase(department)) {
                System.out.println(allEmployees.get(i));
            }
        }
    }
    public static void arrangeWorkers () {
        Employee temporary;
        for (int i = 0; i < allEmployees.size()-1; i++) {
            for (int j = i+1; j < allEmployees.size(); j++) {
                if(allEmployees.get(i).getSalary() < allEmployees.get(j).getSalary()) {
                    temporary = allEmployees.get(i);
                    allEmployees.set(i, allEmployees.get(j));
                    allEmployees.set(j, temporary);
                }
            }
        }
        print();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getSalary() == employee.getSalary() && getName().equals(employee.getName()) && getDepartment().equals(employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepartment(), getSalary());
    }

    @Override
    public String toString() {
        return "\nName: " + name + ", Department: "
                + department + ", Salary: " + salary + "$";
    }
}