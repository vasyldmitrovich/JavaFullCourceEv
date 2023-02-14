package com.softserve.edu08.hw;

public abstract class Person implements Cloneable{
    private int age;
    private FullName fullName;

    public Person(FullName fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }
    public String info(){
        return "First name: <" + this.fullName.getFirstName() + ">, Last name: <" + this.fullName.getLastName() + ">, Age: <" + this.age + ">";
    }
    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonePerson = (Person) super.clone();
        clonePerson.setAge(age);
        clonePerson.setFullName((FullName) fullName.clone());
        return clonePerson;
    }
}
