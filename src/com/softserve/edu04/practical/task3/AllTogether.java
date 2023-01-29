package com.softserve.edu04.practical.task3;

import java.util.Arrays;

public class AllTogether {
    enum Continent {
        AFRICA,
        ASIA,
        AUSTRALIA,
        ANTARCTICA,
        EUROPE,
        NORTH_AMERICA,
        SOUTH_AMERICA
    }

    public static void main(String[] args) {
        String text = Continent.AFRICA.toString();
        System.out.println(text);

        System.out.println();

        System.out.println(Arrays.toString(Continent.values()));
    }
}
