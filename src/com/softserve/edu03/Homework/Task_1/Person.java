package com.softserve.edu03.Homework.Task_1;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    // Constructors

    public Person() {
        input();
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear = 2000;
    }

    // Getters and setters
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

    // Main methods

    public int getAge() {
        int thisYear = Year.now().getValue();
        return thisYear - birthYear;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a name: ");
        firstName = scan.nextLine();

        System.out.print("Enter a surname: ");
        lastName = scan.nextLine();

        System.out.print("Enter a birthday year: ");
        birthYear = scan.nextInt();
    }

    @Override
    public String toString() {
        return "\nFirst name: " + firstName + "\nLast name: " + lastName + "\nThe birthday year: " + birthYear;
    }

    public void changeName(String firstName) {
        this.firstName = firstName;
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
