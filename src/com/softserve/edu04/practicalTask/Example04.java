package com.softserve.edu04.practicalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example04 {
    public static void main(String[] args) throws IOException {
        run();

        System.out.println();
    }
    public static void run() throws IOException {
        System.out.println();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you enjoy Java? (yes/no/maybe)");
        String input = br.readLine();
        String result = switch (input.toLowerCase()) {
            case "yes", "maybe" -> "Great!";
            case "no" -> "Too bad!";
            default -> "Wrong!";
        };
        System.out.println(result);


       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you enjoy Java? (yes/no/maybe)");
        String input = br.readLine();
       var result = switch (input){
           case "yes", "maybe" -> "Great!";
           case "no"-> "To bad!";
           default -> "Wrong";

       };
        System.out.println(result);*/

    }


}


