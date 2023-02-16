package homework__07.task__02;

public class FlyingVehicle extends Passengers implements Vehicle {

    public FlyingVehicle() {
    }

    public void fly() {
        System.out.println("Vehicle is flying.");
    }

    public void land() {
        System.out.println("Vehicle is landing.");
    }
}
