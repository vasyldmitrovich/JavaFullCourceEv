package com.softserve.edu08.homework;

public abstract class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person() {
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
    return String.format("First name: %s\nLast name: %s\nAge: %d\n", fullName.getFirstName(), fullName.getLastName(), getAge());
    }

    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
