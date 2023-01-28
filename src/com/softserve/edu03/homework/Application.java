package com.softserve.edu03.homework;

import java.time.LocalDate;

public class Application {
    public static final String FIRST_NAME = "Input first name for next person";
    public static final String LAST_NAME = "Input last name for ";
    public static final String YEAR_OF_BIRTH = "Input year of birth for ";
    public static void main(String[] args) {
        Person person1 = new Person("Yaroslav", "Tkachyk");
        System.out.println(YEAR_OF_BIRTH + person1.getFirstName() + " " + person1.getLastName() + ":");
        while (person1.getBirthYear() == 0 || person1.getBirthYear() > LocalDate.now().getYear()) {
            try {
                person1.setBirthYear(Integer.parseInt(Person.input()));
            } catch (NumberFormatException exception) {
                System.out.println("You input not Integer. Please try again input correct data");
            }
            if (person1.getBirthYear() > LocalDate.now().getYear()) {
                System.out.println("You input year of birth from the future. Please try again input correct data");
            }
        }
        Person person2 = new Person();
        System.out.println(FIRST_NAME + ":");
        while (person2.getFirstName() == null || person2.getFirstName().equals("")) {
            person2.setFirstName(Person.input());
            if (person2.getFirstName() == null || person2.getFirstName().equals("")) {
                System.out.println("This person should have first name. Please try again input correct data");
            } else {
                break;
            }
        }
        System.out.println(LAST_NAME + person2.getFirstName() + ":");
        while (person2.getLastName() == null || person2.getLastName().equals("")) {
            person2.setLastName(Person.input());
            if (person2.getLastName() == null || person2.getLastName().equals("")) {
                System.out.println(person2.getFirstName() + " should have last name. Please try again input correct data");
            } else {
                break;
            }
        }
        System.out.println(YEAR_OF_BIRTH + person2.getFirstName() + " " + person2.getLastName() + ":");
        while (person2.getBirthYear() == 0 || person2.getBirthYear() > LocalDate.now().getYear()) {
            try {
                person2.setBirthYear(Integer.parseInt(Person.input()));
            } catch (NumberFormatException exception) {
                System.out.println("You input not Integer. Please try again input correct data");
            }
        }

        System.out.println("\nTotal amount of persons is - " + Person.getPersonCount() + "!\n");
        person1.output();
        person2.output();

        // Same logic for each new object Person
    }
}
