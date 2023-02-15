package com.softserve.edu07.homework.task2;

public class Main {
    public static void main(String[] args) {
        Passengers passengers[] = {
                new Liner(20, 5),
                new Boat(7, 15),
                new Plane(70, 2500),
                new Helicopter(8, 3000, 1500),
                new Bus(40, "8A"),
                new Motorcycle(2, 200),
                new Car(4, "Audi")
        };

        for (Passengers passenger : passengers) {
            if (passenger instanceof WaterVehicle) {
                ((WaterVehicle) passenger).isSailing();
            } else if (passenger instanceof FlyingVehicle) {
                ((FlyingVehicle) passenger).fly();
                ((FlyingVehicle) passenger).land();
            } else if (passenger instanceof GroundVehicle) {
                ((GroundVehicle) passenger).drive();
            }
            System.out.println();
        }
    }
}
