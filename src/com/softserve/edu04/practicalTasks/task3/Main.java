package com.softserve.edu04.practicalTasks.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            System.out.print("Enter the name of the country: ");
            String country = scan.nextLine();

            Continent continent;

            switch (country){
                case "Ukraine", "Germany", "England", "China" -> continent = Continent.EURASIA;
                case "Nigeria", "Algeria" -> continent = Continent.AFRICA;
                case "Brazil", "Argentina" -> continent = Continent.SOUTH_AMERICA;
                case "Canada", "Mexico" -> continent = Continent.NORTH_AMERICA;
                default -> continent = Continent.AUSTRALIA;
            }

            continent.findContinent(continent);
        }
    }
}
