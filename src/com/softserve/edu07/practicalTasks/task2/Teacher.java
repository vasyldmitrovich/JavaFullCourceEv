package com.softserve.edu07.practicalTasks.task2;

public class Teacher extends Staff{
    private final String TYPE_PERSON;

    public Teacher() {
        TYPE_PERSON = "teacher";
    }

    public Teacher(int salary, String name) {
        super(name, salary);;
        TYPE_PERSON = "teacher";
    }

    public Teacher(String name, int salary, String TYPE_PERSON) {
        super(name, salary);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public String toString() {
        return super.toString() + " and I am a " + TYPE_PERSON;
    }

    @Override
    public void salary() {
        System.out.println("My salary as a teacher is " + getSalary() + "$");
    }
}
