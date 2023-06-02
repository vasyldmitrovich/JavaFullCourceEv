package com.softserve.project;

    import java.util.Scanner;
    public class SimpleChattyBot {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello! My name is ChatBot.");
            System.out.println("I was created in 2023.");

            System.out.print("Please, remind me your name: ");
            String name = scanner.nextLine();
            System.out.println("What a great name you have, " + name + "!");

            System.out.println("Let me guess your age.");
            System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

            System.out.print("Enter remainder of dividing your age by 3: ");
            int remainder3 = scanner.nextInt();

            System.out.print("Enter remainder of dividing your age by 5: ");
            int remainder5 = scanner.nextInt();

            System.out.print("Enter remainder of dividing your age by 7: ");
            int remainder7 = scanner.nextInt();

            int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

            System.out.println("Your age is " + age + "; that's a good time to start programming!");
        }
    }

