package homework__07.task__02;

public class Helicopter extends FlyingVehicle {

    private int weight;

    private int maxWeight;

    public Helicopter() {
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying.");
    }

    @Override
    public void land() {
        System.out.println("Helicopter is landing.");
    }
}
