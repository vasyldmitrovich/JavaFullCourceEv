package com.softserve.edu05.practical.task2;


public class Application {
    public static void main(String[] args) {
        int employees = Employee.amountOfEmployees();
        Employee.createEmployees(employees);
        Employee.setAllNames();
        Employee.setAllDepartments();
        Employee.setAllSalaries();
        System.out.println("\n This is the list of all employees in order of creation timing: ");
        Employee.print();
        String department = Employee.chooseDepartment();
        Employee.departmentSearch(department);
        System.out.println("\n This is the list of all employees sorted by descending salary: ");
        Employee.arrangeWorkers();
    }
}
