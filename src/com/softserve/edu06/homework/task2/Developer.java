package com.softserve.edu06.homework.task2;

public class Developer extends Employee {
    private String position;
    private String language;

    public Developer() {
    }

    public Developer(String position, String language) {
        this.position = position;
        this.language = language;
    }

    public Developer(String name, int age, double salary, String position, String language) {
        super(name, age, salary);
        this.position = position;
        this.language = language;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String report(){
        return super.report() + "\nPosition: " + position
                + "\nLanguage: " + language;
    }
}
