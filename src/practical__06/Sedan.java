package practical__06;

public class Sedan extends Car {


    public Sedan(String model, int maxSpeed, int yearOfManufacture, boolean ismoved) {

        super(model, maxSpeed, yearOfManufacture, ismoved);
    }

    @Override
    public void run() {
        System.out.println("Car is moving forward.");
    }

    @Override
    public void stop() {
        System.out.println("Car stop.");
    }
}
