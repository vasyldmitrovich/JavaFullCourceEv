package com.softserve.edu02;

import java.util.Arrays;
import java.util.Scanner;

public class Home_work_03_App {
    public static void main(String[] args) {
        Person_hW03  per0= new Person_hW03 ("Endre");
        per0.setLastName("Volkov");
        per0.setBirthYear(1978);

        Person_hW03  per1 = new Person_hW03 ("Oly");
        per1.setLastName("Polykova");
        per1.setBirthYear(1981);

        Person_hW03  per2 = new Person_hW03 ("Andjey");
        per2.setLastName("Dyda");
        per2.setBirthYear(1969);

        Person_hW03  per3 = new Person_hW03 ("Vira");
        per3.setLastName("Brejneva");
        per3.setBirthYear(1969);

        Person_hW03  per4 = new Person_hW03 ("Ivan");
        per4.setLastName("Buhalo");
        per4.setBirthYear(1987);



        System.out.println(per0);
        for (Person_hW03 person_hW03 : Arrays.asList(per1, per2, per3, per4)) {
            System.out.println(person_hW03);
        }
















    }
}
