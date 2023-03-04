package com.softserve.edu06.homeWorkBirds;

public class Main {
    public static void main(String[] args) {

        BirdAbst[] birds = {new Eagle("Philippine", 6.4),
                new Eagle("Martial", 4.6),
                new Swallow("WhiteBacked", 40),
                new Swallow("GreyRumped", 60),
                new Chicken("Brown Leghorn", 4.1),
                new Chicken("Foxy Chick", 2.6),
                new Penguin("Blue penguin ", 1.3),
                new Penguin("Emperor penguin", 35)};

        for (BirdAbst temp : birds) {
            temp.fly();
          //  System.out.println(" ");
        }
    }
}
