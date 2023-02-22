package com.softserve.edu10.homework.task3;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudent(List<Student> students, int course){
        Iterator<Student> iterator = students.iterator();
        Student student;

        while(iterator.hasNext()){
            student = iterator.next();

            if(student.getCourse() == course){
                System.out.println("\n" + student.getName() + " on the " + course + "th course");
            }
        }

        // The second method

//        for(Student student : students){
//            if(student.getCourse() == course){
//                System.out.println("\n" + student.getName() + " on the " + course + "th course");
//            }
//        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", course: " + course;
    }
}
