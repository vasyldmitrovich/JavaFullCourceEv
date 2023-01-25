package homework__01;

import java.util.Scanner;

public class homework__02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, adress;
        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("Hello, " + name + ", where are you live?");
        adress = scan.nextLine();
        System.out.print("So, your name is " + name + " and you live at " + adress + ".");

    }
}
