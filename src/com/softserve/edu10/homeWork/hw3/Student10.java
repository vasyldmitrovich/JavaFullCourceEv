package com.softserve.edu10.homeWork.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student10 {
    private String name;
    private int course;

    public Student10(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public Student10() {

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

    public List<Student10> printStudents(List<Student10> students, int course) {
        List<Student10> list = new ArrayList<>();
        for (Student10 temp : students) {
            if (temp.getCourse() == course) {
                list.add(temp);
            }
        }
        return list;
    }

    public boolean compare(Student10 student) {
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

}

