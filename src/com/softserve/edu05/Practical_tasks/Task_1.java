package com.softserve.edu05.Practical_tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = {4, -7, 6, -2, 9, 0, 1, -5, 4, 2};

        int max = array[0];

        for(int i = 0; i < array.length; i++){
            if(max < array[i])
                max = array[i];
        }
        System.out.println("Max number: " + max);

        int positiveSum = 0;

        for(int i = 0; i < array.length; i++){
            if(0 < array[i])
                positiveSum += array[i];
        }
        System.out.println("Positive sum: " + positiveSum);

        int negativeSum = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < 0)
                negativeSum -= array[i];
        }
        System.out.println("Negative sum: " + negativeSum);

        if(negativeSum < positiveSum)
            System.out.println("Positive sum is bigger");
        else if(positiveSum < negativeSum)
            System.out.println("Negative sum is bigger");
        else
            System.out.println("These amount are equal");
    }
}
