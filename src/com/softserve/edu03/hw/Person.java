package com.softserve.edu03.hw;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.birthYear = 1923;
    }

    public Person(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getAge(){
        return 2023 - this.birthYear;
    }
    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }

    public void output() {
        System.out.println("first name = " + this.firstName + "\tlast name = " + this.lastName + "\told = " + this.getAge());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}