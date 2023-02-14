package com.softserve.edu08.homework;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(int course) {
        this.course = course;
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
        return super.info() + "University course: " + getCourse() + "\n";
    }

    @Override
    public String activity() {
        return "I study in University\n";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student dolly = (Student) super.clone();
        dolly.setFullName(new FullName("Dolly", "Clone"));
        dolly.setCourse(Application.getCourseNumber());
        return dolly;
    }
}
