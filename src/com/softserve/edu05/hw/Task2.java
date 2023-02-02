package com.softserve.edu05.hw;

public class Task2 {
    public static void main(String[] args) {
        int sum = 0, product = 1;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] =(int)(Math.random()*20-10);
            System.out.print(arr[i] + " ");
        }
        if(arr[0] > 0 && arr[1] > 0 && arr[2] > 0 && arr[3] > 0 && arr[4] > 0) {
            for (int i = 0; i < 5; i++) {
                sum += arr[i];
            }
            System.out.println("\nSum of first 5 elements = " + sum);
        } else {
            for (int i = 5; i < arr.length; i++) {
                product *= arr[i];
            }
            System.out.println("\nProduct of 5 last elements = " + product);
        }
    }
}
