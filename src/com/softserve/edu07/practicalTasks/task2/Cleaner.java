package com.softserve.edu07.practicalTasks.task2;

public class Cleaner extends Staff{
    private final String TYPE_PERSON;

    public Cleaner() {
        TYPE_PERSON = "cleaner";
    }

    public Cleaner(int salary, String name) {
        super(name, salary);
        this.TYPE_PERSON = "cleaner";
    }

    public Cleaner(String name, int salary, String TYPE_PERSON) {
        super(name, salary);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    @Override
    public String toString() {
        return super.toString() + " and I am a " + TYPE_PERSON;
    }

    @Override
    public void salary() {
        System.out.println("My salary as a cleaner is " + getSalary() + "$");
    }
}
