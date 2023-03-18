/*
 * Copyright (c) SoftServe Academy
 * This software implements the operation of a simple casino
 */

package com.softserve.project;

/**
 * Class Main demonstrates how the Casino class works
 *
 * @author Marian Moh
 * @version 1.0  11 March 2023
 */

public class Main {
    /**
     * Method main calls the run method which will do all the work
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Method run creates a casino object and can demonstrate the equal and clone methods
     */
    public static void run() {
        Casino casino = new Menu("NewVegas", 1000);

//        //These casinos will be equal if no fields are changed in the second
//        try {
//            Casino cloneOfCasino = (Menu) casino.clone();
//            ((Menu) cloneOfCasino).setBalance(700);
//            System.out.println("Casino and casino2 equals: "
//                    + casino.equals(cloneOfCasino));
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
    }
}
