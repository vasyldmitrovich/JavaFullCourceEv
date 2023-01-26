package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please write a radius");
        int radius = Integer.parseInt(br.readLine());

        double perimeter =2 * Math.PI * radius;
        double area =Math.PI * (radius * radius);

        System.out.println(perimeter);
        System.out.println(area);


    }
}
