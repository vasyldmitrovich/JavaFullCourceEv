package com.softserve.edu06.homeWorkDeveloper;

public class AppDevelop {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Developer06 developer01 = new Developer06("Oleg", 37, 41000.21, "Junior");
        Developer06 developer02 = new Developer06("Ivan", 31, 49000.45, "Middle");
        Developer06 developer03 = new Developer06("Mykola", 41, 53000.76, "Senior");


        System.out.println(developer01.report());
        System.out.println(developer02.report());
        System.out.println(developer03.report());


    }
}
