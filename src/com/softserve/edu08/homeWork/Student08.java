package com.softserve.edu08.homeWork;

public class Student08 extends Person08 {
    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student08(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student08{" +
                "course=" + course +
                '}';
    }

    @Override
    public String activity() {
        return "I study at university. ";
    }
}
