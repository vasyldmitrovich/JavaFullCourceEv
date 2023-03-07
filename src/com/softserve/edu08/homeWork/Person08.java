package com.softserve.edu08.homeWork;

public abstract class Person08 implements Cloneable {
    private FullName fullName;
    private int age;

    public Person08(FullName fullName, int age) {
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
        return "Person08{" +
                "firstName='" + this.fullName.getFirstName() + '\'' +
                ", lastName='" + this.fullName.getLastName() + '\'' +
                ", age=" + this.age +
                '}';
    }

    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person08 clonePerson08 = (Person08) super.clone();
        clonePerson08.setAge(age);
        clonePerson08.setFullName((FullName) fullName.clone());
        return clonePerson08;
    }
}

