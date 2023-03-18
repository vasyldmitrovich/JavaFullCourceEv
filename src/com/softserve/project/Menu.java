package com.softserve.project;

import java.io.*;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Menu adds menus, statistics and comments for the user
 *
 * @author Marian Moh
 * @version 1.0  15 March 2023
 */
public class Menu extends Games {
    public Menu() {
        super();
        welcome();
    }

    public Menu(String casinoName) {
        super(casinoName);
        welcome();
    }

    public Menu(String casinoName, int balance) {
        super(casinoName, balance);
        welcome();
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    /**
     * Method welcome is the first method to run, it gets the correct player name
     */
    public void welcome() {
        Pattern pattern = Pattern.compile("\\w{3,12}");
        System.out.println("\n---Welcome to casino " + getCasinoName() + "---");

        while (true) {
            System.out.print("\nEnter your name: ");
            setPlayerName(scanner.nextLine());
            Matcher matcher = pattern.matcher(getPlayerName());
            if (matcher.matches()) {
                System.out.println("Have a nice time, " + getPlayerName() + "!");
                showMainMenu();
                break;
            } else {
                System.out.println("--Wrong name..."
                        + "You can only enter three to twelve numbers, "
                        + "letters, and underscores");
            }
        }
    }

    public void showMainMenu() {
        System.out.println("\n---Main menu---");
        System.out.println("Games - 1");
        System.out.println("Balance - 2");
        System.out.println("Statistics - 3");
        System.out.println("Comments - 4");
        System.out.println("Exit - 5");

        choice = getUserNumber("Your choice: ", 0, 5);

        if (choice == 1) {
            showGamesMenu();
        } else if (choice == 2) {
            showBalanceMenu();
        } else if (choice == 3) {
            showStatisticsMenu();
        } else if (choice == 4) {
            showCommentsMenu();
        } else {
            System.out.println("\nGoodbye, " + getPlayerName() + "!");
        }
    }

    @Override
    public void showGamesMenu() {
        System.out.println("\n---Game menu---");
        System.out.println("Roulette - 1");
        System.out.println("Treasure Road - 2");
        System.out.println("Crash - 3");
        System.out.println("Main menu - 4");

        choice = getUserNumber("Your choice: ", 1, 4);

        if (choice == 1) {
            startRoulette();
        } else if (choice == 2) {
            startTreasureRoad();
        } else if (choice == 3) {
            startCrash();
        } else {
            showMainMenu();
        }
    }

    /**
     * Method showBalanceMenu allows the player to view, increase and withdraw his balance
     */
    public void showBalanceMenu() {
        System.out.println("\n---Your balance: " + getBalance() + "$---");
        System.out.println("Increase the balance - 1");
        System.out.println("Withdraw the balance - 2");
        System.out.println("Main menu - 3");

        choice = getUserNumber("Your choice: ", 1, 3);

        if (choice == 1) {
            System.out.println("\nHow much do you want to increase your balance?");
            setBalance(getBalance() + getUserNumber("Sum: ", 0, 1000000));
            System.out.println("\nYour balance: " + getBalance() + "$");
        } else if (choice == 2) {
            System.out.println("\nHow much do you want to withdraw your balance?");
            withdrawBalance();
            System.out.println("Your balance: " + getBalance() + "$");
        }
        showMainMenu();
    }


    /**
     * Method showStatisticsMenu will show the success of the player in the games
     * and the time of launching the program
     */
    public void showStatisticsMenu() {
        System.out.println("\n----Your statistics----");
        System.out.println("Profit on Roulette: " + getProfitOnRoulette() + "$");
        System.out.println("Profit on Treasure Road: " + getProfitOnTreasureRoad() + "$");
        System.out.println("Profit on Crash: " + getProfitOnCrash() + "$");
        System.out.println("\nYou started the game at: " + getStartTime()
                .truncatedTo(ChronoUnit.SECONDS));

        System.out.println("\nMain menu - 1");
        choice = getUserNumber("Your choice: ", 1, 1);
        showMainMenu();
    }

    /**
     * Method showCommentsMenu allows player to view the left comments and leave his own
     */
    public void showCommentsMenu() {
        System.out.println("\n----Comments menu----");
        System.out.println("Leave the comment - 1");
        System.out.println("Show the comments - 2");
        System.out.println("Back - 3");

        choice = getUserNumber("Your choice: ", 1, 3);

        if (choice == 1) {
            String userComment = getUserString("\nYour comment: ");
            File fileName = new File(
                    "D:/Programming/Java/Git/JavaFullCourceEv/" +
                            "src/com/softserve/project/Comments.txt");

            FileWriter fileWriter;
            BufferedWriter bufferedWriter;

            try {
                fileWriter = new FileWriter(fileName, true);
                bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write(getPlayerName() + "\n" + userComment + "\n\n");
                bufferedWriter.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        } else if (choice == 2) {
            String line;
            File fileName = new File(
                    "D:/Programming/Java/Git/JavaFullCourceEv/" +
                            "src/com/softserve/project/Comments.txt");

            FileReader fileReader;
            BufferedReader bufferedReader;

            try {
                fileReader = new FileReader(fileName);
                bufferedReader = new BufferedReader(fileReader);

                for (int i = 3; (line = bufferedReader.readLine()) != null; i++) {
                    if (i % 3 == 0) {
                        System.out.println("\nPlayer name: " + line);
                    } else if (i % 3 == 1) {
                        System.out.println("Comment: " + line);
                    }
                }
                bufferedReader.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        showMainMenu();
    }
}