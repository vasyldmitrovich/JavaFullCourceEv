package com.softserve.edu03.hw;

public class Main {
    public static void main(String[] args) {
        Person first = new Person("Will", "Smith");
        Person second = new Person("Tom", "Cruise");
        Person third = new Person("Vin", "Diesel");
        Person fourth = new Person("Sylvester", "Stallone");
        Person fifth = new Person("Bruce", "Willis");
        first.setBirthYear(1968);
        second.setBirthYear(1962);
        third.setBirthYear(1967);
        fourth.setBirthYear(1946);
        fifth.setBirthYear(1955);

    }
}