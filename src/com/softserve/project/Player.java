package com.softserve.project;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Class Player adds fields and methods to interact with the user
 *
 * @author Marian Moh
 * @version 1.1  11 March 2023
 */

public class Player extends Casino implements Cloneable {
    protected Scanner scanner = new Scanner(System.in);

    private String playerName;
    private final LocalTime startTime = LocalTime.now();

    public Player() {
        super();
    }

    public Player(String casinoName) {
        super(casinoName);
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * Method getUserString get a string from the user checking it for correctness
     *
     * @param message will be displayed before user input
     * @return a string that entered the user
     */
    public String getUserString(String message) {
        String userString;

        while (true) {
            System.out.print(message);
            try {
                userString = scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("\n--It's not funny...");
                continue;
            }

            if (!userString.isEmpty()) {
                break;
            }
        }

        return userString;
    }

    /**
     * Method getUserColor get enum RouletteColor from the user checking it for correctness
     *
     * @return enum RouletteColor which is converted from the text entered by the user
     */
    public RouletteColor getUserColor() {
        String userString;
        RouletteColor userColor;
        scanner.nextLine();

        while (true) {
            System.out.print("Color: ");
            try {
                userString = scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("\n--It's not funny...");
                continue;
            }

            if (userString.equalsIgnoreCase("red")) {
                userColor = RouletteColor.RED;
                break;
            } else if (userString.equalsIgnoreCase("black")) {
                userColor = RouletteColor.BLACK;
                break;
            } else {
                System.out.println("\n--Wrong string... ");
            }
        }

        return userColor;
    }

    /**
     * Method getUserString get a number from the user checking it for correctness
     *
     * @param message will be displayed before user input
     * @return a number that entered the user
     */
    public int getUserNumber(String message, int min, int max) {
        int userNumber;

        while (true) {
            System.out.print(message);
            try {
                userNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("\n--It's not funny...");
                continue;
            }

            if ((min <= userNumber) && (userNumber <= max)) {
                break;
            } else {
                System.out.println("\n--Wrong number...");
            }
        }

        return userNumber;
    }

    /**
     * Method getUserString get a fractional number from the user
     * checking it for correctness
     *
     * @param message will be displayed before user input
     * @return a fractional number that entered the user
     */
    public float getUserNumber(String message, float min, float max) {
        float userNumber;

        while (true) {
            System.out.print(message);
            try {
                userNumber = scanner.nextFloat();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("\n--It's not funny...");
                continue;
            }

            if ((min <= userNumber) && (userNumber <= max)) {
                break;
            } else {
                System.out.println("\n--Wrong number...");
            }
        }

        return userNumber;
    }

    /**
     * Method getUserString fills the list with integers
     * using the getUserNumber method
     */
    public void getUserNumbers(List<Integer> list) {
        while (true) {
            int value = getUserNumber("Number: ", -1, 36);

            if (list.size() < 18) {
                if (list.contains(value)) {
                    System.out.println("\n--You've already entered this number");
                } else if (value != -1) {
                    list.add(value);
                } else {
                    break;
                }
            } else {
                System.out.println("\n--You can't enter more numbers");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlayer name: " + playerName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Player other = (Player) obj;

        if (getCasinoName() == null && other.getCasinoName() != null) {
            return false;
        }

        if (!getCasinoName().equals(other.getCasinoName())) {
            return false;
        }

        if (playerName == null) {
            return other.playerName == null;
        } else {
            return playerName.equals(other.playerName);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime * ((playerName == null) ? 0 : playerName.hashCode());
        result += prime * ((getCasinoName() == null) ? 0 : getCasinoName().hashCode());
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Player clonePlayer = (Player) super.clone();
        clonePlayer.setCasinoName(getCasinoName());
        clonePlayer.setPlayerName(playerName);
        return clonePlayer;
    }
}
