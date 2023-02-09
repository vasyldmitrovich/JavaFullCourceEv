package com.softserve.edu06.practcalTasks.task1;

public class Main {
    public static void main(String[] args) {
        Car audi = new Sedan("Audi", 200, 2020, 25000);
        Car porsche = new Sedan("Porsche", 240, 2018, 32000);
        Car scania = new Truck("Scania", 145, 2018, true);
        Car reno = new Truck("Reno", 130, 2015, false);

        Car cars[] = {audi, porsche, scania, reno};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }

        System.out.println("Let's test our " + audi.getModel());
        for (int i = 0; i < 4; i++){
            audi.run();
        }
        audi.stop();

        System.out.println("\nLet's test our " + scania.getModel());
        for (int i = 0; i < 5; i++){
            scania.run();
        }
        scania.stop();
    }
}
