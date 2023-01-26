package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please write value A");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Please write value B");
        int b = Integer.parseInt(br.readLine());

        int sum = a * b;
        int subtraction = a - b;
        int division = a / b;
        int multiplication  = a * b;

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(division);
        System.out.println(multiplication);



        System.out.println("How are you");
        String answer = br.readLine();
        System.out.println("You are " + answer);

    }
}
