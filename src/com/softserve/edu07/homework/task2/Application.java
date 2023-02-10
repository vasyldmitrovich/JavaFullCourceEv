package com.softserve.edu07.homework.task2;

public class Application {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Application.printAllInfo(createAllVehicles());
    }

    public static Vehicle[] createAllVehicles() {
        Vehicle[] allVehicles = {new Liner(600, 3), new Boat(25, 480),
                new Plane(400, 12000), new Helicopter(8, 3550, 8000),
                new Bus(40, "Chernivtsi-London"), new Motorcycle(2, 310),
                new Car(5, "Honda")};
        return allVehicles;
    }

    public static void printAllInfo(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof WaterVehicle) {
                ((WaterVehicle) vehicle).isSailing();
            }
            if (vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
            }
            if (vehicle instanceof GroundVehicle) {
                ((GroundVehicle) vehicle).drive();
            }
        }
    }
}
