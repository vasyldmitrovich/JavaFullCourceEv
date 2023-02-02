package com.softserve.edu05.Homework.Task_4;

public class Car {
    String type;
    int year;
    float engine_capacity;

    public Car(String type, int year, float engine_capacity){
        this.type = type;
        this.year = year;
        this.engine_capacity = engine_capacity;
    }

    public void print(){
        System.out.println("\nModel: " + type + "\nYear: " + year  + "\nEngine capacity: " + engine_capacity);
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }
}
