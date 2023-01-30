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

    // Main methods

    public int getAge(){
        int thisYear = Year.now().getValue();
        return thisYear - birthYear;
    }

    public void input(){
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a name: ");
        firstName = scan.nextLine();

        System.out.print("Enter a surname: ");
        lastName = scan.nextLine();

        System.out.print("Enter a birthday year: ");
        birthYear = scan.nextInt();
    }

    public void output(){
        System.out.println("\nFirst name: " + firstName + "\nLast name: " + lastName + "\nThe birthday year: " + birthYear);
    }

    public void changeName(String firstName){
        this.firstName = firstName;
    }

    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
