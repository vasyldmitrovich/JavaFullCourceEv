package com.softserve.edu11.practicalTasks.task3;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] usernames = getUsernames(5);
        checkUsername(usernames);
    }

    public static String[] getUsernames(int n){
        String[] usernames = new String[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter the username: ");
            usernames[i] = scanner.nextLine();
        }
        return usernames;
    }

    public static void checkUsername(String[] usernames){
        System.out.println();
        Pattern pattern = Pattern.compile("[\\w_]{3,15}");

        for(String username : usernames) {
            Matcher matcher = pattern.matcher(username);

            boolean isGood = matcher.matches();

            if(isGood){
                System.out.println("Name - " + username + " is good");
            } else {
                System.out.println("Name - " + username + " is not good");
            }
        }
    }
}
