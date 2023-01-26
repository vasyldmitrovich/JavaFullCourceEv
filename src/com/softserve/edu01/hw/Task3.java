package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task3 {

    //imagine that we will call to England(2$/min), USA(5$/min) and Australia(8$/min)
    public void callInformation(int time){
        int callToEngland = time * 2;
        int callToUSA = time * 5;
        int callToAustralia = time * 8;

        System.out.println("A call to England lasting " + time + " minutes will cost $" + callToEngland);
        System.out.println("A call to USA lasting " + time + " minutes will cost $" + callToUSA);
        System.out.println("A call to Australia lasting " + time + " minutes will cost $" + callToAustralia);
        System.out.println("All calls together cost $" + (callToAustralia + callToEngland + callToUSA) );
    }

    public static void main(String[] args) {
        System.out.print("Good day!\nEnter 3 time variables in turn:\nFirst value - ");
        Scanner scanner = new Scanner(System.in);
        int firstTime = scanner.nextInt();
        new Task3().callInformation(firstTime);
        System.out.print("Second value - ");
        int secondTime = scanner.nextInt();
        new Task3().callInformation(secondTime);
        System.out.print("Third value - ");
        int thirdTime = scanner.nextInt();
        new Task3().callInformation(thirdTime);
    }
}