package com.softserve.project.Object;

public class Move {
    public static final char X = 'X'; // simplify usage of char 'X'
    public static final char O = 'O'; // simplify usage of char 'O'
    private static char currentMove = Move.O; // Use this to make X moves first
    private static boolean isMoveDone = false; // Use this to check if move was done

    public static char getCurrentMove() {
        return currentMove;
    }
    public static void setCurrentMove(char currentMove) {
        Move.currentMove = currentMove;
    }

    public static boolean isIsMoveDone() {
        return isMoveDone;
    }

    public static void setIsMoveDone(boolean isMoveDone) {
        Move.isMoveDone = isMoveDone;
    }
}
