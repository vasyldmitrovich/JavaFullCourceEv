package com.softserve.edu08.practicalTask;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Nova Poshta");
        Department.Address departmentAddress = department.new Address("Lviv", "Dmytra Danylyshyn", 6);
        department.setAddress(departmentAddress);
        //Good
        Department copyOfDepartment = (Department) department.clone();
        copyOfDepartment.setAddress("Lviv", "Naukova", 30);

        System.out.println("--First department " + department);
        System.out.println("\n--Second department " + copyOfDepartment);
    }
}
