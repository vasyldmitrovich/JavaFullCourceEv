package com.softserve.edu07.practical.task2;

public class Cleaner extends Staff{
    private final String TYPE_PERSON = ("\nMy type of person is - " + getClass().getSimpleName());
    private int workingHours = 160;
    private int hourlyRate = 100;
    public Cleaner() {
        System.out.println(TYPE_PERSON);
    }

    public Cleaner(String name, int workingHours, int hourlyRate) {
        super(name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void print() {
        System.out.println("My name is - " + getName() + "! \nMy salary is - " + salary() + "₴." + TYPE_PERSON +".");
    }

    @Override
    public int salary() {
        // may be fixed (could be like a class field) == could just return a value
        // for cleaners - make a calculation
        return hourlyRate*workingHours;
    }
}
