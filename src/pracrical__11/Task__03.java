package pracrical__11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task__03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Task 3


        System.out.println("Enter user name: ");

        String userName = scan.nextLine();

        Pattern pa = Pattern.compile("[a-zA-Z0-9_]+");

        Matcher ma = pa.matcher(userName);

        if (userName.length() >= 3) {
            System.out.println("Your name length is ok.");
            if (ma.matches()) {
                System.out.println("Your user name is correct!");

            } else {

                System.out.println("Your user name is not correct!");
            }
        } else {
            System.out.println("Your user name should be longer. ");


        }

    }
}