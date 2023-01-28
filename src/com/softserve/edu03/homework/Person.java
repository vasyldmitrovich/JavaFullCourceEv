package com.softserve.edu03.homework;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private static int personCount;

    public Person() {
        personCount++;
    }

    public Person(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
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

    public static int getPersonCount() {
        return personCount;
    }

    public int getAge() {
        return LocalDate.now().getYear() - getBirthYear();
    }

    public static String input() {
            return new Scanner(System.in).nextLine();
    }

    public void output() {
        System.out.println("Person full name is - " + getFirstName() + " " + getLastName() +
                ". Year of birth - " + getBirthYear() + ". Now - " + getAge() + " years old.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return birthYear == person.birthYear && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthYear);
    }
}
