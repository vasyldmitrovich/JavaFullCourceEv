package homework__04;

import java.util.Scanner;

public class task__03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of HTTP error(The correct entry is \"HTTP400\"): ");
        String a = scan.nextLine();
        Error error = null;
        try {
            error = Error.valueOf(a);
        } catch (IllegalArgumentException e) {
            System.out.println("Enter another number of HTTP error.");

        }
        if (error != null) {
            System.out.println(error);
        } else {
            System.out.println("You did not enter nubmer of HTTP errors.");
        }
    }
}