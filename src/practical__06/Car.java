package practical__06;

public abstract class Car {

    private String model;
    private int maxSpeed;
    private int yearOfManufacture;
    boolean ismoved;

    public Car(String model, int maxSpeed, int yearOfManufacture, boolean ismoved) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
        this.ismoved = ismoved;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {

        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {

        this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture() {

        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {

        this.yearOfManufacture = yearOfManufacture;
    }

    public void moved(boolean a) {
        if (a == true) {
            run();
        } else {
            stop();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    public abstract void run();

    public abstract void stop();
}
