package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter how much call c1 cost per minute");
        int c1 = Integer.parseInt(br.readLine());

        System.out.println("Enter how much call c2 cost per minute");
        int c2 = Integer.parseInt(br.readLine());

        System.out.println("Enter how much call c3 cost per minute");
        int c3 = Integer.parseInt(br.readLine());

        System.out.println("Enter how many minutes the call lasted c1");
        int t1 = Integer.parseInt(br.readLine());

        System.out.println("Enter how many minutes the call lasted c2");
        int t2 = Integer.parseInt(br.readLine());

        System.out.println("Enter how many minutes the call lasted c3");
        int t3 = Integer.parseInt(br.readLine());

        int call_1 = c1 * t1;
        int call_2 = c2 * t2;
        int call_3 = c3 * t3;
        int all_call = (c1 + c2 + c3 ) * ( t1 + t2 + t3 ); //int all_call = call_1 + call_2 + call_3

        System.out.println("For first call - " + call_1 + " cents" );
        System.out.println("For second call - " + call_2 + " cents");
        System.out.println("For third call - " + call_3 + " cents");
        System.out.println("For alls call - " + all_call + " cents" );

    }
}

