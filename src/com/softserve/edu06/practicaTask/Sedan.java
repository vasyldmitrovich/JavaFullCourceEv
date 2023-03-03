
package com.softserve.edu06.practicaTask;


public class Sedan extends AbstCar {

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model,maxSpeed, yearOfManufacture);
    }

     @Override
    public void run() {
       System.out.println("run");
           }

           @Override
           public void stop() {
               System.out.println("stop");
           }

    @Override
    public String toString() {
        return "Sedan " + this.getModel() +  "\tmaxSpeed " + this.getMaxSpeed() + "\tYear of manufacture " + this.getYearOfManufacture() ;
    }
    }


