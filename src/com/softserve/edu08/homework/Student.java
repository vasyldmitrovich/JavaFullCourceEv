package com.softserve.edu08.homework;

public class Student extends Person{
    private int course;

    public Student() {
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + "\nCourse: " + course;
    }

    @Override
    public String activity() {
        return switch (course) {
            case 1 -> "I am a first year student";
            case 2 -> "I am a second year student";
            case 3 -> "I am a third year student";
            default -> "I am a fourth year student";
        };
    }
}
