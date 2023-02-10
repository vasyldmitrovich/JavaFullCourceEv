package com.softserve.edu07.homework.task2;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(String route) {
        this.route = route;
    }

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("This is " + getClass().getSimpleName() +
                ".\nIt is type of " + getClass().getSuperclass().getSimpleName() +
                ", so it can drive according to set route " + getRoute() +
                " and transfer up to " + getPassengers() + " passengers.\n");
    }
}

