package com.softserve.edu01.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Task3_v2 {
    private static String country = "";

    public static void main(String[] args) {
        run();
    }

    public static void run () {
        // introducing
        speechOfDialer("Hello! I'm InternationalDialer v.1.0.0! " +
                "I will help you to connect with your friends all around the world!");
        // ask username
        speechOfDialer("What is your name?");
        String name = getUserName();
        // ask to choose the country
        speechOfDialer("Ok " + name + ", let's choose the country you want to connect:");
        // present costTable
        createHashMap();
        // get call
        getCall();
    }

    static void speechOfDialer(String text) {
        char[] array = text.toCharArray();
        for (char symbol : array) {
            System.out.print(symbol);
            try {
                Thread.sleep(1);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println();
    }

    static String getUserName() {
        String name = "";
        InputStream input = System.in;
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(reader);
        try {
            name = buffer.readLine();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return name;
    }

    public static String getCountry() {
        String country = "";
        InputStream input = System.in;
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(reader);
        try {
            country = buffer.readLine();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return country;
    }

    public static double getTime() {
        String minutes = "";
        String seconds = "";
        double time = 0.0;
        InputStream input = System.in;
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(reader);
        while (time == 0.0) {
            try {
                minutes = buffer.readLine();
                seconds = buffer.readLine();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            try {
                time = Double.parseDouble(minutes) + Double.parseDouble(seconds) / 60;
            } catch (NumberFormatException e) {
                speechOfDialer("You have entered not an Integer. Please input correct data!");
            }
        }
        return time;
    }

    public static void getCall () {
        while (!checkCountry(country)) {
            speechOfDialer("Please choose one of available options:");
            country = getCountry();
            // check country
            if (checkCountry(country)) {
                // start a call
                speechOfDialer("Ok, you choose " + country.toUpperCase() + ". Connecting....");
                speechOfDialer("Please enter amount of used minutes and press Enter, " +
                        "after enter amount of used seconds and press Enter");
                double time = getTime();
                System.out.println("Call duration: " + time +  " minutes. Your bill is " + cost(country.toUpperCase(), time) + "$");
            } else {
                // incorrect input. end of program
                System.out.println("Cannot find country " + country + " in available list. ");
            }
        }
    }

    public static double cost (String country, double time) {
        double cost = switch (country.toUpperCase()) {
            case "USA" -> 2.1 * time;
            case "GREAT BRITAIN" -> 1.5 * time;
            case "CHINA" -> 3.7 * time;
            default -> 0.0;
        };
        return Math.round(cost*100.0)/100.0;
    }

    public static boolean checkCountry(String country) {
        return (country.equalsIgnoreCase("Great Britain")) ||
                (country.equalsIgnoreCase("USA")) ||
                (country.equalsIgnoreCase("China"));
        }

   public static void createHashMap() {
        System.out.println();
        HashMap<String, Double> costTable = new HashMap<>();
        costTable.put("GREAT BRITAIN", 1.5);
        costTable.put("USA", 2.1);
        costTable.put("CHINA", 3.7);
        for (var entity : costTable.entrySet()) {
            String key = entity.getKey();
            Double value = entity.getValue();
            System.out.println("Call to " + key + " costs " + value + "$ per minute");
        }
        System.out.println();
    }
}
