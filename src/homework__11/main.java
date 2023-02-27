package homework__11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Task 1

        System.out.println("Task 1");

        System.out.println("Please, enter sentence of five words: ");

        String sentence = scan.nextLine();

        Pattern p = Pattern.compile("[ a-zA-z]+");

        Matcher m = p.matcher(sentence);

        String[] arr = sentence.split(" ");

        String n = arr[0];

        int d = arr[0].length();

        for (int i = 1; i < arr.length; i++) {
            if (d < arr[i].length()) {
                n = arr[i];

            }
            d++;

        }

        int litters = 0;
        StringBuilder a = new StringBuilder(arr[1]);

        if (!m.matches()) {
            System.out.println("You enter wrong symbols!");
        } else {
            System.out.println("Longest word in sentence:" + n);
            litters = n.length();
            System.out.println("Length of longest word = " + litters);

            System.out.println("Revers second word: " + a.reverse());
        }

    }

}