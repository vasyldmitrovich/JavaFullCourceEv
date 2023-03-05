package com.softserve.project.GameStages;

import com.softserve.project.Object.GameTable;
import com.softserve.project.Object.Move;

public class Situation {
    public static boolean isGamePossible() {
        return !isX_Win() || !isO_Win();
    } // Check the pattern for correctness

    public static boolean isGameFinished() {
        boolean isFinished = true;
        while (true) {
            if (isX_Win()) {
                break;
            }
            if (isO_Win()) {
                break;
            }
            for (int i = 0; i < GameTable.rows; i++) {
                for (int j = 0; j < GameTable.columns; j++) {
                    if (GameTable.battleField[i][j] == ' ') {
                        isFinished = false;
                        break;
                    }
                }
                if (!isFinished) {
                    break;
                }
            }
            break;
        }
        return isFinished;
    } // Check if someone win or if the board have empty cells

    public static boolean isX_Win() {
        return isX_WinByHorizontal() ||
               isX_WinByVertical() ||
               isX_WinByDiagonal();
    } // Check if X win

    public static boolean isX_WinByHorizontal() {
        boolean xWin = false;
        int count = 0;
        for (int i = 0; i < GameTable.rows; i++) {
            for (int j = 0; j < GameTable.columns; j++) {
                if (GameTable.battleField[i][j] == Move.X) {
                    ++count;
                    if (count == 3) {
                        xWin = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            count = 0;
            if (xWin) {
                break;
            }
        }
        return xWin;
    } // Check if X win

    public static boolean isX_WinByVertical() {
        boolean xWin = false;
        int count = 0;
        for (int i = 0; i < GameTable.rows; i++) {
            for (int j = 0; j < GameTable.columns; j++) {
                if (GameTable.battleField[j][i] == Move.X) {
                    ++count;
                    if (count == 3) {
                        xWin = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            count = 0;
            if (xWin) {
                break;
            }
        }
        return xWin;
    } // Check if X win

    public static boolean isX_WinByDiagonal() {
        return (GameTable.battleField[GameTable.rows / 2][GameTable.columns / 2] == Move.X) &&
               ((GameTable.battleField[0][0] == Move.X && GameTable.battleField[GameTable.rows - 1][GameTable.columns - 1] == Move.X) ||
               (GameTable.battleField[0][GameTable.columns - 1] == Move.X && GameTable.battleField[GameTable.rows - 1][0] == Move.X));
    } // Check if X win

    public static boolean isO_Win() {
        return isO_WinByHorizontal() ||
                isO_WinByVertical() ||
                isO_WinByDiagonal();
    } // Check if O win

    public static boolean isO_WinByHorizontal() {
        boolean oWin = false;
        int count = 0;
        for (int i = 0; i < GameTable.rows; i++) {
            for (int j = 0; j < GameTable.columns; j++) {
                if (GameTable.battleField[i][j] == Move.O) {
                    ++count;
                    if (count == 3) {
                        oWin = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            count = 0;
            if (oWin) {
                break;
            }
        }
        return oWin;
    } // Check if O win

    public static boolean isO_WinByVertical() {
        boolean oWin = false;
        int count = 0;
        for (int i = 0; i < GameTable.rows; i++) {
            for (int j = 0; j < GameTable.columns; j++) {
                if (GameTable.battleField[j][i] == Move.O) {
                    ++count;
                    if (count == 3) {
                        oWin = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            count = 0;
            if (oWin) {
                break;
            }
        }
        return oWin;
    } // Check if O win

    public static boolean isO_WinByDiagonal() {
        return (GameTable.battleField[GameTable.rows / 2][GameTable.columns / 2] == Move.O) &&
               ((GameTable.battleField[0][0] == Move.O && GameTable.battleField[GameTable.rows - 1][GameTable.columns - 1] == Move.O) ||
               (GameTable.battleField[0][GameTable.columns - 1] == Move.O && GameTable.battleField[GameTable.rows - 1][0] == Move.O));
    } // Check if O win
}

