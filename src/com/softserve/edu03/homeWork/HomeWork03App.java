package com.softserve.edu03.homeWork;

import java.util.Arrays;

public class HomeWork03App {
    public static void main(String[] args) {
        PersonW03 per0 = new PersonW03("Endre");
        per0.setLastName("Volkov");
        per0.setBirthYear(1978);

        PersonW03 per1 = new PersonW03("Oly");
        per1.setLastName("Polykova");
        per1.setBirthYear(1981);

        PersonW03 per2 = new PersonW03("Andjey");
        per2.setLastName("Dyda");
        per2.setBirthYear(1969);

        PersonW03 per3 = new PersonW03("Vira");
        per3.setLastName("Brejneva");
        per3.setBirthYear(1969);

        PersonW03 per4 = new PersonW03("Ivan");
        per4.setLastName("Buhalo");
        per4.setBirthYear(1987);


        System.out.println(per0);
        for (PersonW03 PersonW03 : Arrays.asList(per1, per2, per3, per4)) {
            System.out.println (PersonW03);
        }


    }
}
