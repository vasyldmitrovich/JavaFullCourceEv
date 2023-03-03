package com.softserve.edu06.practicaTask;

public class AppCar06 {

    public static void main(String[] args) {
        AbstCar[] abs0 = {new Sedan("Audi", 280, 2019),
                new Sedan("Mercedes", 230, 2018),
                new Truck("MAN", 180, 2015),
                new Truck("Volvo", 2020, 180)};
        for (AbstCar temp : abs0) {
            System.out.println(temp);
        }
    }
}
