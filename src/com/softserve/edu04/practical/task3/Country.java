package com.softserve.edu04.practical.task3;

public class Country {
    private String name;
    private String shortCode;
    private Continent continent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Country() {
    }

    public Country(String name, String shortCode, Continent continent) {
        this.name = name;
        this.shortCode = shortCode;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return getName() + " (" + getShortCode() + ") from " + getContinent();
    }

    public static void main(String[] args) {
        Country bestCountry = new Country("Ukraine", "UA", Continent.EUROPE);
        Country otherCountry = new Country();
        otherCountry.setName("United States of America");
        otherCountry.setShortCode("USA");
        otherCountry.setContinent(Continent.NORTH_AMERICA);

        System.out.println(otherCountry + " support " + bestCountry + "!\n");

        Continent[] continents = Continent.values();
        for (Continent continent : continents) {
            System.out.println(continent);
        }

        System.out.println();

        Continent continentToPrint = Continent.ASIA;
        System.out.println(continentToPrint);

        System.out.println();


    }
}
