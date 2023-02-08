package com.softserve.edu01.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    private static final String PROMPT_STRING_COST = "\nEnter the cost for next country call or enter exit to finish:";
    private static final String EXIT = "exit";
    private static final String PROMPT_STRING_DURATION = "\nEnter the call duration for next country: ";
    private static final String INTEGER_REQUIRED = "Need to input INTEGER!";
    private static int countryCounter = 0;
    private static int costListIndexCounter = 0;
    private static int durationArrayCounter = 0;
    private static long totalBill = 0;
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Integer> costList = new ArrayList<>();
    private static int[] durationArray;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        getCallCostUntilExit();
        getCallDuration();
        printCost();
    }

    public static String getInfo() {
        return scanner.next();
    }

    public static void getCallCostUntilExit() {
        while (true) {
            System.out.println(PROMPT_STRING_COST);
            String input = getInfo();
            if (input.equalsIgnoreCase(EXIT)) {
                break;
            }
            try {
                int cost = Integer.parseInt(input);
                costList.add(cost);
                ++countryCounter;
                System.out.println("Cost for country #" + countryCounter + " is " + costList.get(costListIndexCounter++) + "$");
            } catch (NumberFormatException exception) {
                System.out.println(INTEGER_REQUIRED);
            }
        }
    }

    public static void getCallDuration() {
        durationArray = new int[countryCounter];
        System.out.println(PROMPT_STRING_DURATION);
        int duration;
        countryCounter = 0;
        while (durationArrayCounter < durationArray.length) {
            String input = getInfo();
            try {
                duration = Integer.parseInt(input);
                durationArray[durationArrayCounter] = duration;
                ++countryCounter;
                System.out.println("Call duration for country #" + countryCounter + " is " + durationArray[durationArrayCounter++] + " minutes");
            } catch (NumberFormatException exception) {
                System.out.println(INTEGER_REQUIRED);
            }
        }
    }

    public static void printCost() {
        for (int i = 0; i < countryCounter; ) {
            int bill = costList.get(i) * durationArray[i];
            i++;
            System.out.println("\nThe bill for calling country # " + i + " is " + bill + "$");
            totalBill += bill;
        }
        System.out.println("\nYour final bill is " + totalBill + "$");
    }
}
