package com.softserve.edu10.homework.task3;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // declare List students and add to the list five different students
        List<Student> list = createListOfStudents();
        printList(list);
        /* method printStudents (List students, Integer course),
           which receives a list of students and the course number
           and prints to the console the names of the students from the list,
           which are taught in this course (1 - w/o iterator; 2 - with iterator)
        */
        Student.printStudents1(list, 3);
        System.out.println("\nNow your turn! Enter the course number to display students of this course:\n");
        Student.printStudents2(list, getCourseFromUser());
        // display the list of students ordered by name
        Student.printListSortedByName(list);
        // display the list of students ordered by course
        Student.printListSortedByCourse(list);
    }

    public static List<Student> createListOfStudents() {
        List<Student> list = new ArrayList<>();
        Collections.addAll(list,
                new Student("Yaroslav", 3),
                new Student("Oleg", 2),
                new Student("Olena", 1),
                new Student("Anna", 2),
                new Student("Luka", 3));
        return list;
    }

    public static void printList(List<Student> list) {
        System.out.println("\nDisplay list of students:\n");
        list.forEach(System.out::println);
    }

    public static int getCourseFromUser() {
        Scanner scanner = new Scanner(System.in);
        int course = 0;
        while (course < 1) {
            try {
                course = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You input not integer");
                course = 0;
            }
            if (course < 1) {
                System.out.println("Please input integer greater than 0");
            }
        }
        return course;
    }
}
