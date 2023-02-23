package com.softserve.edu10.homework.task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private Integer course;

    public Student() {
    }

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student name: " + name + ", course: " + course + ";";
    }

    public static void printStudents1(List<Student> list, Integer course) {
        System.out.println("\nHere we got students of course #" + course + ":\n");
        int count = 0;
        for (Student student : list) {
            if (student.getCourse().equals(course)) {
                ++count;
                System.out.println(count + ") " + student.getName());
            }
        }
    }

    public static void printStudents2(List<Student> list, Integer course) {
        int count = 0;
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse().equals(course)) {
                ++count;
                System.out.println(count + ") " + student.getName());
            }
        }
        if (list.stream().map(student -> student.getCourse()).noneMatch(number -> number.equals(course))) {
            System.out.println("Any student for this course!");
        }
    }

    public static void printListSortedByName(List<Student> list) {
        System.out.println("\nDisplay list of students sorted by name:\n");
        list.sort(Comparator.comparing(student -> student.getName()));
        list.forEach(System.out::println);
    }

    public static void printListSortedByCourse(List<Student> list) {
        System.out.println("\nDisplay list of students sorted by course:\n");
        list.sort(Comparator.comparing(student -> student.getCourse()));
        list.forEach(System.out::println);
    }
}

