package com.softserve.edu04.homeWork;
import java.util.Scanner;

public class NumberMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        int [] arr = {firstNumber,secondNumber, thirdNumber };
        int max = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
            int [] arr1 = {firstNumber,secondNumber, thirdNumber };
            int min = Integer.MAX_VALUE;
            int j = 0;
            while (j < arr.length) {
                if (arr1[j] < min)  {
                    min = arr1[j];
                }
                j++;

        }

        System.out.println("Max number is " + max + " Min number is "+ min);

    }
}
