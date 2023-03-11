package com.softserve.edu14.homework.task2;


public class Employee {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nName: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;


        Employee employee = (Employee) obj;

        return employee.name.equals(((Employee) obj).name);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        return prime * ((name == null) ? 0 : name.hashCode());
    }
}
