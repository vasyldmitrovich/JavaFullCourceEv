package com.softserve.edu02;
/*
public class Home_Work_2 {
    public static void main(String[] args) {
        Student st0 = new Student("Petro");
        Student st1 = new Student("Oleg");
        Student st2 = new Student("Vita");

        st0.setRating(60);
        st1.setRating(79);
        st2.setRating(86);

        System.out.println("\nTotal students is " + Student.getStudentCount() + ":\n");
        System.out.println(st0);
        System.out.println(st1);
        System.out.println(st2);

        System.out.println("\nTotal rating is " + Student.getTotalRating());
        System.out.println("Average rating of all students is " + Student.getAvrRating() + "\n");

        System.out.println (" Why is the best student?");
        System.out.println(st0.getName() + " - "+ Student.betterStudent(st0));
        System.out.println(st1.getName() + " - " + Student.betterStudent(st1));
        System.out.println(st2.getName() + " - " + Student.betterStudent(st2));
    }
}    */

import java.io.PrintStream;
import java.util.Arrays;

/*
_______________________________________________________________________________________________________________________
        EMPLOYEE
_______________________________________________________________________________________________________________________
         */
        public class Home_Work_2 {
            public static void main(String[] args) {

                Employee  em0 = new Employee("Olga", 165f);
                Employee  em1 = new Employee ("Vita",170f);
                Employee  em2 = new Employee ("Vira", 120f);

               em0.setRate(70.8f);
               em1.setRate (70.8f);
               em2.setRate(70.8f);

                System.out.println(em0);
                for (Employee employee : Arrays.asList(em1, em2)) {
                    System.out.println(employee);
                }

                System.out.println ("\nInformation about employee");
                System.out.println(em0.getName() + " - " + "Your salary with bonuses 10% " + (em0.getSalary() + (em0.getSalary() * 0.1f)));
                System.out.println(em1.getName() + " - "+ "Your salary with bonuses 10% " +(em1.getSalary()+ (em1.getSalary() *0.1f)));
                System.out.println(em2.getName() + " - "+ "Your salary with bonuses 10% " + (em2.getSalary()+ (em2.getSalary() *0.1f)));

               System.out.println("\nTotal salary of all workers is " + (em0.getSalary()+em1.getSalary()+em2.getSalary())); //загальна зарплата всіх працівників
            }
        }