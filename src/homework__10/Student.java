package homework__10;

import java.util.*;

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

    //Task c
    public void printStudents(List<Student> students, int course1) {

        List<String> stud = new ArrayList<>();

        ListIterator<Student> listIterator = students.listIterator();

        while (listIterator.hasNext()) {
            Student current = listIterator.next();

            if (current.getCourse() == course1) {

                stud.add(current.getName());
            }
        }
        System.out.println(stud);
    }

    //Task d
    public boolean compareName(Student name, Student name1) {

        boolean result = false;

        if (name.getName().equals(name1.getName())) {

            result = true;
        }

        if (result) {

            System.out.println("Name of this Student is the same. [" + name.getName() + " and " + name1.getName() + ".]");
        } else {

            System.out.println("Name of this Student is not the same. [" + name.getName() + " and " + name1.getName() + ".]");
        }
        return result;
    }

    public boolean compareCourse(Student course, Student course1) {
        boolean result = false;
        if (course.getCourse() == course1.getCourse()) {

            result = true;

        }
        if (result) {

            System.out.println("Course of this Student is the same. [" + "Name: " + course.getName() + " " + course.getCourse() + " course" + " and " + "name: " + course1.getName() + " " + course1.getCourse() + " course.]");

        } else {

            System.out.println("Course of this Student is not the same.");
        }
        return result;
    }

}

