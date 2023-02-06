package com.softserve.edu06.homework.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Yaroslav",31,54321.0);
        Employee employee2 = new Developer(); // розширення типу
        employee2.setName("John");
        employee2.setAge(35);
        employee2.setSalary(65432.1);
        // not available setPosition  if Type of variable is Employee
        Developer developer1 = new Developer();
        developer1.setName("Pep");
        developer1.setAge(30);
        developer1.setSalary(76543.2);
        developer1.setPosition("Senior Java Developer");
        // if Type of Variable is Developer - setter is available
        Developer developer2 = new Developer("Bill", 40, 87654.3, "Scala developer");
        System.out.println(employee1.report());
        System.out.println(employee2.report());
        System.out.println(developer1.report());
        System.out.println(developer2.report());
        if (employee2 instanceof Developer employee3) {
            //звуження типу, тепер можна викликати методи класу Developer
            employee3.setPosition("Kotlin Developer");
            System.out.println(employee3.report());
        }

    }
}
