package com.softserve.project.Object;

public class Player {
    private static String playerXName;
    private static String playerOName;

    public static String getPlayerXName() {
        return playerXName;
    }

    public static void setPlayerXName(String playerXName) {
        Player.playerXName = playerXName;
    }

    public static String getPlayerOName() {
        return playerOName;
    }

    public static void setPlayerOName(String playerOName) {
        Player.playerOName = playerOName;
    }
}
