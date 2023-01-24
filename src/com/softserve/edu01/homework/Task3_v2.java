package com.softserve.edu01.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Task3_v2 {
    public static void main(String[] args) {
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
        String country = getCountry();
        // check country
        if (checkCountry(country))
        {
            // start a call
            speechOfDialer("Ok, you choose " + country.toUpperCase() + ". Connecting....");
            speechOfDialer("Please enter amount of used minutes and press Enter, " +
                    "after enter amount of used seconds and press Enter");
            double time = getTime();
            System.out.println( "Dear " + name + " your bill is " + cost(country.toUpperCase(), time) + "$");

        } else {
            // incorrect input. end of program
            System.out.println("Cannot find country " + country +
                    " in available list. Please restart a program and choose a correct option!");
        }
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
    static double cost (String country, double time) {
        double cost = 0.0;
        switch (country.toUpperCase()) {
            case "USA":
                cost = 2.1 * time;
                break;
            case "GREAT BRITAIN":
                cost = 1.5 * time;
                break;
            case "CHINA":
                cost = 3.7 * time;
        }
        return Math.round(cost*100.0)/100.0;
    }
    static String getCountry() {
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

    static boolean checkCountry(String country) {
        return (
                (country.equalsIgnoreCase("Great Britain")) ||
                (country.equalsIgnoreCase("USA")) ||
                (country.equalsIgnoreCase("China"))) ? true : false;
        }

    static double getTime() {
        String minutes = "";
        String seconds = "";
        double time = 0.0;
        InputStream input = System.in;
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(reader);
        try {
            minutes = buffer.readLine();
            seconds = buffer.readLine();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try{
            time = Double.parseDouble(minutes) + Double.parseDouble(seconds)/60;
        }
        catch (NumberFormatException e) {
            speechOfDialer("You have entered not an Integer. You've got a penalty bill for max call duration (60 minutes)!");
            time = time+60;
        }

        return time;
    }

    static void createHashMap() {
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
