package com.softserve.edu08.homework;

public abstract class Person implements Cloneable{
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

    public String info(){
        return "\nFirst name: " + fullName.getFirstName() +
                "\nLast name: " + fullName.getLastName() +
                "\nAge: " + age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonePerson = (Person) super.clone();
        clonePerson.setAge(age);
        clonePerson.setFullName((FullName) clonePerson.fullName.clone());
        return clonePerson;
    }

    public abstract String activity();
}
