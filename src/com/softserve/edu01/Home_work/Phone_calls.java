package com.softserve.edu01.Home_work;

import java.io.PrintStream;
import java.util.Scanner;

public class Phone_calls {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println ("Hi, COLL PRICE: \n USA-2$, \n United Kingdom-1.5$, \n Europe-0.8$," );
        Double USA=2.0;
        Double UK=1.5;
        Double Europe=1.5;

        System.out.println ("\n"+"You spoke with USA min:");
        Double tUSA  = console.nextDouble();
        PrintStream printf = System.out.printf("\n"+"Your account with USA " + "%.2f", (USA * tUSA));

        System.out.print ("\n"+"You spoke with United Kingdom min:");
        Double tUK  = console.nextDouble();
        System.out.printf ("\n"+"Your account with United Kingdom " + "%.2f", (UK*tUK));

        System.out.println ("\n"+"You spoke with United Europe min:");
        Double tEurope  = console.nextDouble();
        System.out.printf ("\n"+"Your account with United Europe " + "%.2f", (Europe*tEurope));

        System.out.printf("\n"+"Your general conversation is " + "%.2f", (USA*tUSA)+(UK*tUK)+(Europe*tEurope));



    }
}
