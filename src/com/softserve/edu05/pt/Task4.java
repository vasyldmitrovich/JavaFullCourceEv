package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Car first = new Car("sedan", 2020, 2);
        Car second = new Car("universal", 2019, 3);
        Car third = new Car("hatchback", 2018, 2);
        Car fourth = new Car("pickup", 2021, 4);
        Car[] cars = {first, second, third, fourth};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int lfYear = scanner.nextInt();
        for (Car temp: cars) {
            if(temp.getYear() == lfYear) System.out.println(temp);
        }
        System.out.println("---------------------------------------");
        Car tmp = null;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i +1; j < cars.length; j++) {
                if(cars[i].getYear() < cars[j].getYear()){
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (Car temp: cars) {
            System.out.println(temp);
        }
    }
}
class Car{
    private String type;
    private int year;
    private int engineCapacity;

    public Car(String type, int year, int engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}