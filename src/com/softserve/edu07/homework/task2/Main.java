package com.softserve.edu07.homework.task2;

public class Main {
    public static void main(String[] args) {
        Passengers liner = new Liner(20, 5);
        Passengers boat = new Boat(7, 15);
        Passengers plane = new Plane(70, 2500);
        Passengers helicopter = new Helicopter(8, 3000, 1500);
        Passengers bus = new Bus(40, "8A");
        Passengers motorcycle = new Motorcycle(2, 200);
        Passengers car = new Car(4, "Audi");

        Passengers passengers[] = {liner, boat, plane, helicopter, bus, motorcycle, car};

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
