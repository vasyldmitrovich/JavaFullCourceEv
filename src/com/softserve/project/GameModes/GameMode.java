package com.softserve.project.GameModes;

import com.softserve.project.GameStages.Situation;
import com.softserve.project.Methods.Methods;
import com.softserve.project.Object.Player;

public class GameMode {
    // Option to play 1 on 1
    public static void versusOpponent() {
        System.out.println("What is your name?");
        Player.setPlayerXName(Methods.getPlayerName());
        System.out.println("What is your opponent name?");
        Player.setPlayerOName(Methods.getPlayerName());
        System.out.println("Let the battle begin!\n");
        Methods.printEmptyBoard(); // Use this to start with empty board
        // printRegexBoard(); // Use this to start with manually half-filled board
        if (Situation.isGamePossible()) { // This ''if'' - for pattern play
            while (!Situation.isGameFinished()) { // loop to continue a game while it is not finished (while someone win a game)
                Methods.getMoveFromUser(); // method that asks user to make a move
                Methods.checkGame(); // method that check if the game have a final result
            }
        }
        else {
            System.out.println("Game-board situation is not possible");
        }
    }

    // Option to play versus computer
    public static void versusComputer() {
        System.out.println("What is your name?");
        Player.setPlayerXName(Methods.getPlayerName());
        System.out.println("Let the battle begin!\n");
        Methods.printEmptyBoard(); // Use this to start with empty board
        // printRegexBoard(); // Use this to start with manually half-filled board
        if (Situation.isGamePossible()) {
            while (!Situation.isGameFinished()) {
                Methods.getUserMove();
                Methods.checkGame();
                if (!Situation.isGameFinished()) {
                    Methods.getAIMove();
                    Methods.checkGame2();
                }
            }
        }
    }
}


