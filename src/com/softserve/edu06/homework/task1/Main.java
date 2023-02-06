package com.softserve.edu06.homework.task1;

public class Main {
    public static void main(String[] args) {
        Bird [] birds = new Bird [4];
        Bird firstBird  = new Eagle(true,true);
        firstBird.setType("Eagle");
        birds [0] = firstBird;
        FlyingBird secondBird = new FlyingBird();
        secondBird.setFeathers(true);
        secondBird.setLayEggs(true);
        secondBird.setType("Swallow");
        birds [1] = secondBird;
        Penguin thirdBird = new Penguin(false,true);
        thirdBird.setType("Penguin");
        birds[2] = thirdBird;
        Bird forthBird = new NonFlyingBird();
        forthBird.setFeathers(true);
        forthBird.setLayEggs(true);
        forthBird.setType("Chicken");
        //-----------
        Bird fifthBird = new Chicken();
        fifthBird.setFeathers(true);
        fifthBird.setLayEggs(true);
        fifthBird.setType("Chicken");

        System.out.println("\nIf there is no getType in the chicken class\n--- Variable fifthBird when i call getType() is: " + fifthBird.getType() + " " +
                "\tTHIS IS NOT CORRECT\nIf I do cast type I will have a mismatch\n");
        //-----------

        birds [3] = forthBird;
        for (Bird bird : birds) {
            System.out.print(bird);
            bird.fly();
        }
    }
}
