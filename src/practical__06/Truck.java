package practical__06;

public class Truck extends Car {


    public Truck(String model, int maxSpeed, int yearOfManufacture, boolean ismoved) {

        super(model, maxSpeed, yearOfManufacture, ismoved);
    }

    @Override
    public String toString() {

        return super.toString();
    }

    @Override
    public void run() {

        System.out.println("Car is moving.");
    }

    @Override
    public void stop() {

        System.out.println("Car stopped.");
    }
}
