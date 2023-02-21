package com.softserve.edu04.practicalTask;

import java.util.Scanner;

enum Continent {
    NORTH_AMERICA, SOUTH_AMERICA, AFRICA, EUROPE, ASIA, OCEANIA, NOT_COUNTRY
}

public class Country {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Continent continent = null;
        System.out.println("Enter country:  ");
        String country = console.nextLine();
        switch (country) {
            case "Anguilla", "Aruba", "Bahamas", "Barbados", "Belize", "Bermuda", "Bonaire",
                    "Canada", "Cayman Islands", "Clipperton Island", "Costa Rica", "Cuba", "Curacao",
                    "Dominica", "El Salvador", "Venezuela", "Greenland", "Grenada", "Guadeloupe", "Guatemala",
                    "Haiti", "Honduras", "Jamaica", "Martinique", "Mexico", "Montserrat", "Nueva Esparta",
                    "Panama", "Puerto Rico", "Saba", "San Andres", "Gustavia", "Basseterre":
                continent = Continent.NORTH_AMERICA;
                break;

            case "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay",
                    "Peru", "Suriname", "Uruguay", "Venezuela 2":
                continent = Continent.SOUTH_AMERICA;
                break;

            case "Nigeria", "Egypt", "South Africa", "Algeria", " Angola", "Morocco", "Kenya", "Ethiopia",
                    "Libya", " Ghana", "Sudan", "Togo", "Senegal", "Mali", "Liberia", "Tunisia", "Burundi",
                    "Mozambique", "Tanzania", "Uganda", "Zambia", "Zimbabwe", "Cameroon", "Chad",
                    "Gabon", "Botswana", "Eswatini", "Namibia", "Benin", "Ghana":
                continent = Continent.AFRICA;
                break;

            case "Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belarus", "Belgium", "Bosnia»and»Herzegovina",
                    "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "France",
                    "Georgia", "Germany", "Greece", "Hungary", "Iceland", "Ireland", "Italy", "Kazakhstan", "Latvia", "Liechtenstein",
                    "Lithuania", "Luxembourg", "Malta", "Moldova", "Monaco", "Montenegro", "Netherlands", "North Macedonia", "Norway",
                    "Poland", "Portugal", "Romania", "russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland",
                     "Turkey", "Ukraine", "United Kingdom", "Vatican": continent = Continent.EUROPE; break;

            case "China", "Japan", " India", "moscov", " Iran", "South Korea", "Indonesia", "Saudi Arabia",
                    "Turkey ", "Taiwan":
                continent = Continent.ASIA;
                break;
            case "Australia", "New Zealand", "Fiji", "Papua", "Solomon Islands", "Vanuatu", "Melanesia ", "Nauru",
                    "Hawaii", "Samoa", "Tonga", "Tuvalu":
                continent = Continent.OCEANIA;
                break;

            default: continent=Continent.NOT_COUNTRY;
        };
        System.out.print(continent);
    }
}
