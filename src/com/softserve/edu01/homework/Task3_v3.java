package com.softserve.edu01.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Task3_v3 {

    public static long countdownStart = 0;
    public static long countdownStop = 0;
    public static double time = 0.0;
    public static String chosenContinent = "";
    public static String name = "";

    public static void main(String[] args) {
        // introducing
        speechOfDialer("Hello! I'm InternationalDialer v.1.0.0! " +
                "I will help you to connect with your friends all around the world!");
        // ask username
        speechOfDialer("What is your name?");
        name = getUserName();
        // ask to choose the country
        speechOfDialer("Glad to meet you " + name + ", let's choose the continent where the country you want to connect with is located:");
        // present costTable
        createHashMap();
        // client choose the country
        chosenContinent = getContinent();
        // start a call
        speechOfDialer("Connecting.... Call has been started!");
        // timer is on
        countdownStart = timeStart();
        speechOfDialer(name + ", press ENTER to finish the call!");
        // timer is off
        countdownStop = timeFinish();
        time = callDuration(countdownStart, countdownStop);
        // final message
        speechOfDialer("Dear " + name + ", you have just finished the call to " + chosenContinent + "! Duration: " + time + " seconds! Your bill is " + cost(chosenContinent, time) + "$");
        speechOfDialer(name + ", I hope you have enjoyed this homework application written in Java!");
    }

    static void speechOfDialer(String text) {
        char[] array = text.toCharArray();
        for (char symbol : array) {
            System.out.print(symbol);
            try {
                Thread.sleep(200);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println();
    }

    static String getUserName() {
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

    static double cost(String country, double time) {
        double cost = switch (country.toUpperCase()) {
            case "NORTH AMERICA" -> 3.1 * time / 60;
            case "SOUTH AMERICA" -> 3.4 * time / 60;
            case "EUROPE" -> 1.5 * time / 60;
            case "ASIA" -> 2.0 * time / 60;
            case "AUSTRALIA" -> 4.2 * time / 60;
            case "ANTARCTICA" -> 9.9 * time / 60;
            case "AFRICA" -> 3.7 * time / 60;
            default -> 0.0;
        };
        return Math.round(cost * 100.0) / 100.0;
    }

    static String getContinent() {
        while (true) {
            InputStream input = System.in;
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader buffer = new BufferedReader(reader);
            try {
                chosenContinent = buffer.readLine();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            if (checkContinent(chosenContinent)) {
                System.out.println(name + ", your chosen continent is " + chosenContinent.toUpperCase() + "!");
                break;
            } else {
                System.out.println(name + ", choose the correct Continent please!");
            }
        }
        return chosenContinent.toUpperCase();
    }

    static boolean checkContinent(String continent) {
        return (continent.equalsIgnoreCase("NORTH AMERICA")) ||
                (continent.equalsIgnoreCase("SOUTH AMERICA")) ||
                (continent.equalsIgnoreCase("EUROPE")) ||
                (continent.equalsIgnoreCase("ASIA")) ||
                (continent.equalsIgnoreCase("AUSTRALIA")) ||
                (continent.equalsIgnoreCase("ANTARCTICA")) ||
                (continent.equalsIgnoreCase("AFRICA"));
    }

    static long timeStart() {
        Date now = new Date();
        return now.getTime();
    }

    static long timeFinish() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Date now = new Date();
        if (input.equals("")) {
            now = new Date();
        }
        return now.getTime();
    }

    static double callDuration(long start, long end) {
        return Math.round((end * 1.0 - start) / 1000 * 100.0) / 100.0;
    }

    static void createHashMap() {
        System.out.println();
        HashMap<String, Double> costTable = new HashMap<>();
        costTable.put("NORTH AMERICA", 3.1);
        costTable.put("SOUTH AMERICA", 3.4);
        costTable.put("EUROPE", 1.5);
        costTable.put("ASIA", 2.0);
        costTable.put("AUSTRALIA", 4.2);
        costTable.put("ANTARCTICA", 9.9);
        costTable.put("AFRICA", 3.7);
        for (var entity : costTable.entrySet()) {
            String key = entity.getKey();
            Double value = entity.getValue();
            System.out.println("Call to country located at " + key + " continent costs " + value + "$ per minute");
        }
        System.out.println();
    }
}