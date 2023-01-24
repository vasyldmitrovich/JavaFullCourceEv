package com.softserve.edu01.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static final String PROMPT_STRING_COST = "\nEnter the cost for next country call or enter exit to finish:";
    public static final String EXIT = "exit";
    public static final String PROMPT_STRING_DURATION = "\nEnter the call duration for next country: " ;
    public static final String INTEGER_REQUIRED = "Need to input INTEGER!";
    public static int countryCounter = 0;
    public static int costListIndexCounter = 0;
    public static int durationArrayCounter = 0;
    public static long totalBill = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> costList = new ArrayList<>();
        while (true) {
            System.out.println(PROMPT_STRING_COST);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase(EXIT)) {
                break;
            }
            int cost;
            try {
                cost = Integer.parseInt(input);
                costList.add(cost);
                countryCounter = ++countryCounter;
                System.out.println("Cost for country #" + countryCounter + " is " + costList.get(costListIndexCounter++) + "$");
            } catch (NumberFormatException exception) {
                System.out.println(INTEGER_REQUIRED);
            }
        }
        int[] durationArray = new int[countryCounter];
        System.out.println(PROMPT_STRING_DURATION);
        int duration;
        countryCounter = 0;
        while (durationArrayCounter < durationArray.length) {
            String input = scanner.nextLine();
            try {
                duration = Integer.parseInt(input);
                durationArray[durationArrayCounter] = duration;
                countryCounter = ++countryCounter;
                System.out.println("Call duration for country #" + countryCounter + " is " + durationArray[durationArrayCounter++] + " minutes");
            } catch (NumberFormatException exception) {
                System.out.println(INTEGER_REQUIRED);
            }
        }
        for (int i = 0; i < countryCounter; ) {
            int bill = costList.get(i) * durationArray[i];
            i++;
            System.out.println("\nThe bill for calling country # " + i + " is " + bill + "$");
            totalBill += bill;
        }
        System.out.println("\nYour final bill is " + totalBill + "$");
    }
}
