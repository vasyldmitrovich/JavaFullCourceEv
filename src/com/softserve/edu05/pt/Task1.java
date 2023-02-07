package com.softserve.edu05.pt;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] =(int)(Math.random()*20-10);
            System.out.print(array[i] + " ");
        }
        int sumPositive = 0;
        int biggest = array[0];
        /*Try to give shorter names to variables */
        int amountOfPositiveNumbers = 0;
        int amountOfNegativeNumbers = 0;
        for (int temp:array) {
            if(temp > 0){ sumPositive += temp;
            amountOfPositiveNumbers++;}
            if(biggest < temp) biggest = temp;
            if(temp < 0) amountOfNegativeNumbers++;
        }
        System.out.println("\nSum of posiyive numbers = " + sumPositive);
        System.out.println("Biggest value of array = " + biggest);
        System.out.println("Amount of negative numbers of array = " + amountOfNegativeNumbers);
        if(amountOfPositiveNumbers > amountOfNegativeNumbers) System.out.println("Positive values there are more");
        else System.out.println("Negative values there are more");
    }
}
