package com.softserve.edu04.Practical_tasks.Task_3;

public enum Continent {
    EURASIA, AFRICA, SOUTH_AMERICA, NORTH_AMERICA, AUSTRALIA;

    public void findContinent(Continent continent){
        switch(continent){
            case EURASIA -> System.out.println("This is Eurasia\n");
            case AFRICA -> System.out.println("This is Africa\n");
            case SOUTH_AMERICA -> System.out.println("This is South America\n");
            case NORTH_AMERICA -> System.out.println("This is North America\n");
            case AUSTRALIA -> System.out.println("This is Australia\n");
        }
    }
}
