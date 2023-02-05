package com.softserve.edu01.Home_work;

import java.util.Scanner;

public class variables_name_and_address {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println ("Hi, what is your name?" );
        String name = console.nextLine();
        System.out.println("Where are you live," + "  "+ name +"?");
        String live = console.nextLine();
        System.out.println("Wat do you do," + "  "+ name +" "+ "with" + " "+live+"?");

    }
}

