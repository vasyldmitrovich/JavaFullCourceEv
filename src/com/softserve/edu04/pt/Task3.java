package com.softserve.edu04.pt;

import java.util.Scanner;

enum Сontinent {
    AFRICA, NORT_AMERICA, SOUTH_AMERICA, EURASIA, COUNTRY_IS_NOT_YET_IN_THE_DATABASE, AUSTRALIA
}

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Сontinent continent = null;
        System.out.print("enter country name - ");
        String country = scanner.nextLine();
        switch (country) {
            case "Canada", "USA", "Mexico": continent = Сontinent.NORT_AMERICA; break;
            case "Colombia", "Argentina", "Brazil", "Chile", "Peru", "Venezuela": continent = Сontinent.SOUTH_AMERICA; break;
            case  "Nigeria", "Ethiopia", "Egypt", "Congo", "Tanzania", "Kenya", "Uganda", "Sudan", "Morocco": continent = Сontinent.AFRICA; break;
            case  "Finland", "France", "Georgia", "Germany", "Greece", "Poland", "Ukraine", "China", "India": continent = Сontinent.EURASIA; break;
            case "Australia", "New Zealand": continent = Сontinent.AUSTRALIA; break;
            case "Russia" :
                System.out.println("no such country exists!");
                break;

            default: continent = Сontinent.COUNTRY_IS_NOT_YET_IN_THE_DATABASE;
        };
        System.out.print(continent);
    }
}

