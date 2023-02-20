package practical__08;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        run();
    }

    public static void run() {

        Department dp = new Department("Hospital", "Zelena", "Lviv", 24);

        System.out.println("Original object = " + dp);

        Department newDp = null;
        try {
            newDp = (Department) dp.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error");
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Copied object = " + newDp);

        //
        System.out.println(" ");

        System.out.println("Enter new city name:  ");

        newDp.address.setCity(scan.nextLine());

        System.out.println("Changed = " + newDp);

    }
}