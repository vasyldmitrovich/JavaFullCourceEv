package com.softserve.edu06.practicaTask;

/*rename class without word Abst, reed code convention for understanding */
public abstract class AbstCar {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public AbstCar(){
    }

    public AbstCar(String model, int maxSpeed, int yearOfManufacture ){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

        public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "AbstCar{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    public abstract void run();
    public abstract void stop();
}
