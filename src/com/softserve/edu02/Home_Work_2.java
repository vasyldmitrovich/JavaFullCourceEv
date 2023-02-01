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

import java.util.Arrays;

/*
        EMPLOYEE
         */
        public class Home_Work_2 {
            public static void main(String[] args) {
                Employee  em0 = new Employee ("Vira");
                Employee  em1 = new Employee ("Olga");
                Employee  em2 = new Employee("Vita");

               /* em0.setRate(12,6);
                em1.setRating(79);
                em2.setRating(68);*/

                em0.setHours(140);
                em1.setHours(160);
                em2.setHours(120);

                System.out.println("\nTotal employee is " + Employee.getTotalSum() + ":\n");
                System.out.println(em0);
                for (Employee employee : Arrays.asList(em1, em2)) {
                    System.out.println(employee);
                }

                System.out.println("\nTota hours is " + Employee.getTotalHours());
                System.out.println("Average hours of all employee is " + Employee.getAvrHours() + "\n");

                System.out.println (" Why is the best employee?");
                System.out.println(em0.getName() + " - "+ Employee.betterEmployee(em0));
                System.out.println(em1.getName() + " - " + Employee.betterEmployee(em1));
                System.out.println(em2.getName() + " - " + Employee.betterEmployee(em2));
            }
        }



