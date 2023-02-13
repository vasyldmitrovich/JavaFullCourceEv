package com.softserve.edu03.practicalTask;

import com.softserve.edu04.Student;

public class MainStudent {
    public static void main(String[] args) {

        /*Fix spaces, reed Java Code Convention*/
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
        /*Change 'why' to 'who'*/
        System.out.println(" Who is the best student?");
        System.out.println(st0.getName() + " - " + Student.betterStudent(st0));
        System.out.println(st1.getName() + " - " + Student.betterStudent(st1));
        System.out.println(st2.getName() + " - " + Student.betterStudent(st2));
    }
}


