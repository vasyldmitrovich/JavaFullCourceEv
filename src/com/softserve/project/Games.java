package com.softserve.project;

import java.util.*;

/**
 * Class Games adds three games, balance work and betting work
 *
 * @author Marian Moh
 * @version 1.0  15 March 2023
 */
public class Games extends Player implements Cloneable {
    public int choice;

    private int bet;
    private int balance = 0;
    private int balanceBeforeGame;

    private int profitOnRoulette = 0;
    private int profitOnTreasureRoad = 0;
    private int profitOnCrash = 0;

    public Games() {
    }

    public Games(String casinoName) {
        super(casinoName);
    }

    public Games(String casinoName, int balance) {
        super(casinoName);
        this.balance = balance;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getProfitOnRoulette() {
        return profitOnRoulette;
    }

    public void setProfitOnRoulette(int profitOnRoulette) {
        this.profitOnRoulette = profitOnRoulette;
    }

    public int getProfitOnTreasureRoad() {
        return profitOnTreasureRoad;
    }

    public void setProfitOnTreasureRoad(int profitOnTreasureRoad) {
        this.profitOnTreasureRoad = profitOnTreasureRoad;
    }

    public int getProfitOnCrash() {
        return profitOnCrash;
    }

    public void setProfitOnCrash(int profitOnCrash) {
        this.profitOnCrash = profitOnCrash;
    }

    /**
     * Method makeBet accepts the correct bet from the user
     *
     * @return user's bet
     */
    public int makeBet() {
        int userBet = -1;

        if (balance != 0) {
            while (true) {
                System.out.print("\nEnter your bet: ");
                try {
                    userBet = scanner.nextInt();
                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("\n--It's not funny...");
                    continue;
                }

                if (balance < userBet) {
                    System.out.println("\n--Your balance is too small...");
                } else {
                    if ((0 <= userBet) && (userBet <= 1000000)) {
                        bet = userBet;
                        break;
                    } else {
                        System.out.println("\n--Wrong bet...");
                    }
                }
            }
        } else {
            System.out.println("\n--Your balance is too small...");
            showBalanceMenu();
        }

        return userBet;
    }

    /**
     * Method withdrawBalance withdraws money from the user's account
     */
    public void withdrawBalance() {
        int userInt;

        if (balance != 0) {
            while (true) {
                System.out.print("Sum: ");
                try {
                    userInt = scanner.nextInt();
                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("\n--It's not funny...");
                    continue;
                }

                if (balance < userInt) {
                    System.out.println("\n--Your balance is too small...");
                } else {
                    balance -= userInt;
                    System.out.println("\nYou withdraw " + userInt + "$");
                    break;
                }
            }
        } else {
            System.out.println("\n--Your balance is too small...");
            showBalanceMenu();
        }
    }

    /**
     * Method outWin displays information about the user's victory with a delay
     *
     * @param randomNumber is just random number
     * @param win          this is the user's prize for winning
     * @param waiting      delay before showing result and after
     * @param <T>          randomNumber can different type
     */
    public <T> void outWin(T randomNumber, int win, int waiting) {
        pause(waiting + 500);
        System.out.println("\nYou guessed it!"
                + "\nThe random was: " + randomNumber
                + "\nYour win: " + win + "$");
        pause(waiting);
    }

    /**
     * Method outLose displays information about the user's lose with a delay
     *
     * @param randomNumber is just random number
     * @param lose         this is the user's fine for losing
     * @param waiting      delay before showing result and after
     * @param <T>          randomNumber can be different type
     */
    public <T> void outLose(T randomNumber, int lose, int waiting) {
        pause(waiting + 500);
        System.out.println("\nYou didn't guess"
                + "\nThe random was: " + randomNumber
                + "\nYour lost: " + lose + "$");
        pause(waiting);
    }

    /**
     * Method pause will wait for some time
     *
     * @param time is waiting time
     */
    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

    /**
     * Method isContinuation asks the user if he would like to continue the game
     * @return true if user wants to continue the game and false if not
     */
    public boolean isContinuation() {
        System.out.println("\nYour balance: " + balance + "$");

        if (0 < balance) {
            System.out.println("Continue - 1"
                    + "\nBack - 2");

            choice = getUserNumber("Your choice: ", 1, 2);
            return choice == 1;
        } else {
            System.out.println("\nYour balance is to small...");
            return false;
        }
    }

    /**
     * The startRoulette method is the first game that has three mini-games,
     * the work of the method is similar to standard roulette
     */
    public void startRoulette() {
        int randomNumber;
        balanceBeforeGame = balance;

        System.out.println(
                "\n\n---Welcome to Roulette---\n"
                        + "\nBet on a number - 1"
                        + "\nBet on color - 2"
                        + "\nBet on many numbers - 3"
                        + "\nGame menu - 4");

        choice = getUserNumber("Your choice: ", 1, 4);

        if (choice != 4) {
            bet = makeBet();
        }

        if (choice == 1) {
            while (true) {
                randomNumber = (int) (Math.random() * 37);

                System.out.println("\nEnter a number between 0 and 36");
                choice = getUserNumber("Number: ", 0, 36);

                if (choice == randomNumber) {
                    outWin(randomNumber, bet * 35, 750);
                    balance += bet * 35;
                } else {
                    outLose(randomNumber, bet, 750);
                    balance -= bet;
                }

                if (!isContinuation()) {
                    profitOnRoulette += balance - balanceBeforeGame;
                    startRoulette();
                    break;
                }
            }
        } else if (choice == 2) {
            while (true) {
                randomNumber = (int) (Math.random() * 37);

                System.out.println("\nEnter color (red or black)");
                RouletteColor userColor = getUserColor();
                RouletteColor randomColor;

                if (randomNumber % 2 == 0) {
                    randomColor = RouletteColor.BLACK;
                } else {
                    randomColor = RouletteColor.RED;
                }

                if (randomColor == userColor) {
                    outWin(randomColor, bet, 750);
                    balance += bet;
                } else {
                    outLose(randomColor, bet, 750);
                    balance -= bet;
                }

                if (!isContinuation()) {
                    profitOnRoulette += balance - balanceBeforeGame;
                    startRoulette();
                    break;
                }
            }
        } else if (choice == 3) {
            while (true) {
                randomNumber = (int) (Math.random() * 37);

                System.out.println("\nEnter many numbers (-1 to finish)");
                List<Integer> list = new ArrayList<>();
                getUserNumbers(list);

                if (list.contains(randomNumber)) {
                    outWin(randomNumber, bet * 36 / list.size(), 750);
                    balance += bet * 36 / list.size();
                } else {
                    outLose(randomNumber, bet, 750);
                    balance -= bet;
                }

                if (!isContinuation()) {
                    profitOnRoulette += balance - balanceBeforeGame;
                    startRoulette();
                    break;
                }
            }
        } else {
            showGamesMenu();
        }
    }

    /**
     * Method startTreasureRoad is the second game that will reward
     * the user depending on his risk
     */
    public void startTreasureRoad() {
        balanceBeforeGame = balance;
        List<Integer> coefficients = Arrays.asList(2, 9, 30, 100);

        int randomNumber;
        int oldBalance = 0;
        int newBet;
        int previousBet = 0;

        System.out.println(
                "\n\n----Welcome to Treasure Road----\n"
                        + "\n--You can bet from one to five times on 1, 2 or 3."
                        + "\nif you guess the first time you get x2, if you guess the second"
                        + " time you get x9,\n" + "if you guess the third time you get 30x and"
                        + " if you guess the fourth time you get 100x.");

        bet = makeBet();

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                oldBalance = balance;
                previousBet = 0;
            }
            randomNumber = (int) (Math.random() * 3) + 1;
            choice = getUserNumber("Your game choice: ", 1, 3);

            if (randomNumber == choice) {
                newBet = bet * coefficients.get(i);
                outWin(randomNumber, newBet, 750);
                balance += newBet - previousBet;
                previousBet = newBet;

                if (i == 4) {
                    System.out.println(
                            "\n---Congratulate! You have passed the treasure road!---\n"
                                    + "Your balance: " + balance + "$");
                    showGamesMenu();
                    break;
                }

                if (!isContinuation()) {
                    profitOnTreasureRoad += balance - balanceBeforeGame;
                    showGamesMenu();
                    break;
                }
            } else {
                outLose(randomNumber, (oldBalance - bet), 750);
                balance = oldBalance - bet;
                i = -1;

                if (isContinuation()) {
                    bet = makeBet();
                } else {
                    profitOnTreasureRoad += balance - balanceBeforeGame;
                    showGamesMenu();
                    break;
                }
            }
        }
    }

    /**
     * Method startCrash is the third game that turns the entered
     * coefficient of the user into a risk
     */
    public void startCrash() {
        float randomNumber;
        float coefficient;
        balanceBeforeGame = balance;

        System.out.println(
                "\n\n----Welcome to Crash----\n"
                        + "\n--you enter the coefficient, after which the program may or may not reach\n"
                        + "this, if it does, you will get the bet multiplied by the coefficient");

        bet = makeBet();

        while (true) {
            randomNumber = (float) Math.random() * 4 + 1;
            coefficient = getUserNumber("Coefficient: ", 1.0f, 5.0f);
            float way = 1;

            System.out.println();
            while (way < coefficient) {
                System.out.printf("Coefficient: %.3f\n", way);
                //System.out.print("\rCoefficient: " + way); // the second way to out

                way += 0.05f;
                pause(120);

                if (randomNumber <= way) {
                    break;
                }
            }

            if (coefficient < randomNumber) {
                outWin(randomNumber, (int) (bet * coefficient), 0);
                balance += (int) (bet * coefficient);
            } else {
                outLose(randomNumber, bet, 0);
                balance -= bet;
            }

            if (isContinuation()) {
                bet = makeBet();
            } else {
                profitOnCrash += balance - balanceBeforeGame;
                showGamesMenu();
                break;
            }
        }
    }

    public void showGamesMenu() {
    }

    public void showBalanceMenu() {
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nBalance: " + balance + "$"
                + "\nProfit on Roulette: " + profitOnRoulette + "$"
                + "\nProfit on Treasure Road: " + profitOnTreasureRoad + "$"
                + "\nProfit on Crash: " + profitOnCrash + "$";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Games other = (Games) obj;

        if (balance != other.balance) return false;

        if (getPlayerName() == null && other.getPlayerName() != null)
            return false;

        if (!getPlayerName().equals(other.getPlayerName()))
            return false;

        if (getCasinoName() == null)
            return other.getCasinoName() == null;
        else {
            return getCasinoName().equals(other.getCasinoName());
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = balance;
        result += prime * (getPlayerName() == null ? 0 : getPlayerName().hashCode());
        result += prime * (getCasinoName() == null ? 0 : getCasinoName().hashCode());
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Games cloneGames = (Games) super.clone();
        cloneGames.setCasinoName(getCasinoName());
        cloneGames.setPlayerName(getPlayerName());
        cloneGames.setBalance(balance);
        return cloneGames;
    }
}