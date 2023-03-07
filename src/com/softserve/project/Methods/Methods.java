package com.softserve.project.Methods;

import com.softserve.project.GameModes.GameMode;
import com.softserve.project.GameStages.Situation;
import com.softserve.project.Object.GameTable;
import com.softserve.project.Object.Move;
import com.softserve.project.Object.Player;

import java.util.Scanner;

public class Methods {
    static Scanner scanner = new Scanner(System.in); // Use to get feedback from user via console

    public static void runGame() {
        System.out.println("\nWelcome to a TicTacToe game!\n");
        printRules(); // Common display of rules
        runChosenMode(); // possibility to choose a game mode
        System.out.println("\nHope you enjoy it!\n");
    } // Method that run a game

    public static void printRules() {
        System.out.println("""
                   Here is some common rules of the game:
                1. Game board is a 3x3 table;
                2. 2 sides take part in a game: X and O;
                3. Both sides are making their moves by queue;
                3. Side X - performs first move;
                4. To make a move you should enter two integers from "1" to "3";
                5. With a first entered digit - you choose a row of a game board;
                6. With a second entered digit - you choose a column of a game board;
                7. Game is finished when one side will get 3 places on a board in a row (vertical, horizontal or diagonal);
                8. If game board have no empty cells and nobody wins - game will declare a draw;
                9. Good Luck & Have Fun!
                """);
    } // Common display of rules

    public static int chooseGameMode() {
        System.out.println("""
                Please choose a game mode:
                Press "1" if you want to play 1 on 1 with opponent
                Press "2" if you want to play versus computer
                """);
        int gameMode = 0;
        while (gameMode < 1 || gameMode > 2) {
            try {
                gameMode = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please choose between options \"1\" and \"2\"");
            }
            if (gameMode < 1 || gameMode > 2) {
                System.out.println("Please choose between options \"1\" and \"2\"");
            }
        }
        return gameMode;
    } // possibility to choose a game mode

    public static void printEmptyBoard() {
        char[][] battleField = GameTable.battleField;
        System.out.print("---------\n");
        for (int i = 0; i < GameTable.rows; i++) {
            System.out.print("| ");
            for (int j = 0; j < GameTable.columns; j++) {
                battleField[i][j] = ' ';
                System.out.print(battleField[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.print("---------\n");
    } // method to display empty board

    public static void printPatternBoard() {
        System.out.println("Please enter initial position pattern:");
        String pattern = scanner.nextLine();
        String regex = "[XO ]{9}";
        if (pattern.matches(regex)) {
            System.out.print("---------\n");
            for (int i = 0; i < GameTable.rows; i++) {
                System.out.print("| ");
                for (int j = 0; j < GameTable.columns; j++) {
                    GameTable.battleField[i][j] = pattern.toCharArray()[i * GameTable.rows + j];
                    System.out.print(GameTable.battleField[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.print("---------\n");
        } else {
            System.out.println("invalid input");
        }
    } // method to display a pattern board

    public static void printBoard() {
        System.out.print("---------\n");
        for (int i = 0; i < GameTable.rows; i++) {
            System.out.print("| ");
            for (int j = 0; j < GameTable.columns; j++) {
                System.out.print(GameTable.battleField[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.print("---------\n");
    } // method to display a current board

    public static void getMoveFromUser() {
        int getRow = 0;
        int getColumn = 0;
        switch (Move.getCurrentMove()) {
            case Move.X -> {
                Move.setCurrentMove(Move.O);
                System.out.println(Player.getPlayerOName() + " - now is your turn to move");
            }
            case Move.O -> {
                Move.setCurrentMove(Move.X);
                System.out.println(Player.getPlayerXName() + " - now is your turn to move");
            }
        }
        while (getRow > 3 || getColumn > 3 || getRow < 1 || getColumn < 1 || GameTable.battleField[getRow - 1][getColumn - 1] != ' ') {
            try {
                getRow = Integer.parseInt(scanner.next());
                getColumn = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }
            if (getRow > 3 || getColumn > 3 || getRow < 1 || getColumn < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (GameTable.battleField[getRow - 1][getColumn - 1] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
            }
        }
        GameTable.battleField[getRow - 1][getColumn - 1] = Move.getCurrentMove();
        printBoard();
    } // method to get a move from user

    public static void checkGame() {
        while (true) {
            if (Situation.isX_Win()) {
                System.out.println(Player.getPlayerXName() + " wins");
                break;
            } else if (Situation.isO_Win()) {
                System.out.println(Player.getPlayerOName() + " wins");
                break;
            } else if (Situation.isGameFinished()) {
                System.out.println("Draw");
                break;
            }
            break;
        } /*else {
            System.out.println("Impossible");
        }*/
    } // Method to check if the game have a final result
    public static void checkGame2() {
        while (true) {
            if (Situation.isX_Win()) {
                System.out.println(Player.getPlayerXName() + " wins");
                break;
            } else if (Situation.isO_Win()) {
                System.out.println("Computer wins");
                break;
            } else if (Situation.isGameFinished()) {
                System.out.println("Draw");
                break;
            }
            break;
        } /*else {
            System.out.println("Impossible");
        }*/
    } // Method to check if the game have a final result
    public static void runChosenMode() {
        if (chooseGameMode() == 1) {
            GameMode.versusOpponent();
        } else {
            GameMode.versusComputer();
        }
    } // Method that runs a chosen mode

    public static void getUserMove() {
        int getRow = 0;
        int getColumn = 0;
        System.out.println(Player.getPlayerXName() + " - now is your turn to move");
        while (getRow > 3 || getColumn > 3 || getRow < 1 || getColumn < 1 || GameTable.battleField[getRow - 1][getColumn - 1] != ' ') {
            try {
                getRow = Integer.parseInt(scanner.next());
                getColumn = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }
            if (getRow > 3 || getColumn > 3 || getRow < 1 || getColumn < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (GameTable.battleField[getRow - 1][getColumn - 1] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
            }
        }
        Move.setCurrentMove(Move.X);
        GameTable.battleField[getRow - 1][getColumn - 1] = Move.getCurrentMove();
        printBoard();
    } // Method to get a move from user

    public static void getAIMove() {
        System.out.println("Player AI - now is your turn to move");
        if (GameTable.battleField[1][1] == Move.X) {
            strategy1();
        } else {
            strategy2();
        }
    } // Method to get a move from computer

    public static void strategy1() {
        while (true) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (GameTable.battleField[0][0] == ' ') {
                        GameTable.battleField[0][0] = Move.O;
                        System.out.println("AI made the move - row: 1, column: 1");
                        ++count;
                        break;
                    }
                    if (Math.abs(i - j) == 2 && GameTable.battleField[i][j] == Move.X && GameTable.battleField[j][i] != Move.O) {
                        GameTable.battleField[j][i] = Move.O;
                        System.out.printf("AI made the move - row: %d, column: %d\n", j + 1, i + 1);
                        ++count;
                        break;
                    }
                    if (i != j && GameTable.battleField[i][j] == Move.X && i == 1 && GameTable.battleField[i][Math.abs(j - 2)] != Move.O) {
                        GameTable.battleField[i][Math.abs(j - 2)] = Move.O;
                        System.out.printf("AI made the move - row: %d, column: %d\n", i + 1, Math.abs(j - 2) + 1);
                        ++count;
                        break;
                    }
                    if (i != j && GameTable.battleField[i][j] == Move.X && i % 2 == 0 && GameTable.battleField[Math.abs(i - 2)][j] != Move.O) {
                        GameTable.battleField[Math.abs(i - 2)][j] = Move.O;
                        System.out.printf("AI made the move - row: %d, column: %d\n", Math.abs(i - 2) + 1, j + 1);
                        ++count;
                        break;
                    }
                    if (count == 0 && GameTable.battleField[2][2] == Move.X) {
                        if (GameTable.battleField[i][j] == ' ' && j % 2 == 0) {
                            GameTable.battleField[i][j] = Move.O;
                            System.out.printf("AI made the move - row: %d, column: %d\n", i + 1, j + 1);
                            ++count;
                        }
                        if (count == 0 && GameTable.battleField[0][2] == Move.O && GameTable.battleField[0][1] == ' ') {
                            GameTable.battleField[0][1] = Move.O;
                            System.out.println("AI made the move - row: 1, column: 2\n");
                            ++count;
                            break;
                        }
                        if (count == 0 && GameTable.battleField[2][0] == Move.O && GameTable.battleField[1][0] == ' ') {
                            GameTable.battleField[1][0] = Move.O;
                            System.out.println("AI made the move - row: 2, column: 1\n");
                            ++count;
                            break;
                        }
                    }
                }
                if (count != 0) {
                    break;
                }
            }
            break;
        }
        printBoard();
    } // Strategy if first move from user is to occupy center cell (not perfect)

    public static void strategy2() {
        while (true) {
            Move.setIsMoveDone(false);
            if (GameTable.battleField[1][1] == ' ') {
                GameTable.battleField[1][1] = Move.O;
                System.out.println("AI made the move - row: 2, column: 2");
            } else {
                for (int i = 0; i < 3; i++) {
                    int count = 0;
                    for (int j = 0; j < 3; j++) {
                        count += GameTable.battleField[i][j];
                        if (count == 208) {
                            for (int k = 0; k < 3; k++) {
                                if (GameTable.battleField[i][k] == ' ') {
                                    GameTable.battleField[i][k] = Move.O;
                                    System.out.printf("AI made the move - row: %d, column: %d\n", i + 1, k + 1);
                                    Move.setIsMoveDone(true);
                                    break;
                                }
                            }
                        }
                    }
                    if (Move.isIsMoveDone()) {
                        break;
                    }
                }
                for (int i = 0; i < 3; i++) {
                    int count = 0;
                    for (int j = 0; j < 3; j++) {
                        count += GameTable.battleField[j][i];
                        if (count == 208) {
                            for (int k = 0; k < 3; k++) {
                                if (GameTable.battleField[k][i] == ' ') {
                                    GameTable.battleField[k][i] = Move.O;
                                    System.out.printf("AI made the move - row: %d, column: %d\n", k + 1, i + 1);
                                    Move.setIsMoveDone(true);
                                    break;
                                }
                            }
                        }
                    }
                    if (Move.isIsMoveDone()) {
                        break;
                    }
                }
                if (!Move.isIsMoveDone()) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j = j + 2) {
                            if (GameTable.battleField[j][i] == ' ') {
                                GameTable.battleField[j][i] = Move.O;
                                System.out.printf("AI made the move - row: %d, column: %d\n", j + 1, i + 1);
                                Move.setIsMoveDone(true);
                                break;
                            }
                        }
                        if (Move.isIsMoveDone()) {
                            break;
                        }
                    }
                }
            }
            break;
        }
        printBoard();
    } // Strategy if first move from user is not to occupy center cell (not perfect)

    public static String getPlayerName() {
        return scanner.nextLine();
    }
}

