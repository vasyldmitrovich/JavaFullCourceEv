package com.softserve.edu04.Practica_task;

import java.util.Scanner;

/*Do not correct naming class, reed Java Code Convention
* PLEASE RENAME IN ALL FILES NAME*/
public class Three_numbers {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int firstNumber = numbers.nextInt();
        int secondNumber = numbers.nextInt();
        int thirdNumber = numbers.nextInt();
        int odd = 0;
        if (firstNumber % 2==1){
        odd++;
        }

        if (secondNumber% 2==1){
            odd++;
        }

        if (thirdNumber % 2==1){
            odd++;
        }



        System.out.println("Your enter " +odd+ " odd numbers");
    }
}