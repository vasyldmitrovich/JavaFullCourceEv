package pracrical__11;

import java.util.Scanner;
import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Task 1

        String pattern = "Java";

        String text = "Java is programming language";

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(text);

        System.out.println(" ");
        System.out.println("Task 1");
        if (m.find()) {

            System.out.println("First string is substring second string");

        } else {
            System.out.println("First string is not substring second string");

        }

        //Task 2
        System.out.println(" ");

        System.out.println("Enter surname, name, middle name: ");

        String name = scan.nextLine();


        String[] arrString = name.split(" ");

        //Task 2(1)
        System.out.println("Task 2(1)");
        System.out.println("Surname: " + arrString[0].substring(0, 1) + "\n" + "Initials: " + arrString[1].substring(0, 1) + ". " + arrString[2].substring(0, 1) + ".");


        //Task 2(2)
        System.out.println(" ");
        System.out.println("Task 2(2)");
        System.out.println("Name" + arrString[1]);

        //Task 2(3)
        System.out.println(" ");
        System.out.println("Task 2(3)");
        System.out.println("Name: " + arrString[1] + "\n" + "Middle name: " + arrString[2] + "\n" + "Last name: " + arrString[0]);


    }

}



