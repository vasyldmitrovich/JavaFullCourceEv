package com.softserve.edu06.homeWorkDeveloper;

public class Developer06 extends Employee06 {
    private String field;

    public Developer06(String name, int age, double salary, String field) {
        super(name, age, salary);
        this.field = field;
    }

    public String report() {
        return "Developer06{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", salary=" + this.getSalary() +
                ", field= " + this.field +
                '}';

    }
}
