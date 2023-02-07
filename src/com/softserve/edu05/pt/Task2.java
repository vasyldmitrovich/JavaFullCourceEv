package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Move next 6 line to some method, and there call that method, do the same with Scanner*/
        Employee first = new Employee("Will", 3, 5000);
        Employee second = new Employee("Bruce", 4, 4000);
        Employee third = new Employee("Tom", 2, 4500);
        Employee fourth = new Employee("John", 3, 5500);
        Employee fifth = new Employee("Sam", 2, 3500);
        Employee[] workers = {first, second, third, fourth, fifth};
        System.out.print("Enter number of department: ");
        Scanner scanner = new Scanner(System.in);
        int lfDepartment = scanner.nextInt();
        for (Employee temp: workers) {
            if(temp.getDepartmentNumber() == lfDepartment){
                System.out.println(temp);
            }
        }
        System.out.println("-------------------------------");
        Employee tmp = null;
        for (int i = 0; i < workers.length - 1; i++) {
            for (int j = i + 1; j < workers.length; j++) {
                if(workers[i].getSalary() < workers[j].getSalary()){
                    tmp = workers[i];
                    workers[i] = workers[j];
                    workers[j] = tmp;
                }
            }
        }
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
    }
}
class Employee{
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}
