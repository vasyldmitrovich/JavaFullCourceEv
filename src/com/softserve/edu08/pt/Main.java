package com.softserve.edu08.pt;

public class Main {
    public static void main(String[] args) {
        Department mainDepartment = new Department("First");
        Department.Adress firstAdress = mainDepartment.new Adress("lviv", "Lychakivska", 17);
        mainDepartment.setAdress(firstAdress);
        System.out.println("main = " + mainDepartment);
        try {
            Department cloneDepartment = (Department) mainDepartment.clone();
            cloneDepartment.setAdress("IF", "Shevchenka", 7);
            System.out.println("clone = " + cloneDepartment);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main = " + mainDepartment);
    }
}
