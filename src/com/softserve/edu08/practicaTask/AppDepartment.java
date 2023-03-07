package com.softserve.edu08.practicaTask;

public class AppDepartment {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        Department department = new Department("One");
        Department.Address oneAddress = department.new Address("Rivne", "Makarova", 11);
        department.setAddress(oneAddress);
        System.out.println(department);

        try {
            Department clonedDepartment = (Department) department.clone();
            clonedDepartment.setAddress("Kyiv", "Naberegna", 67);
            System.out.println(clonedDepartment);
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);

        }

    }
}
