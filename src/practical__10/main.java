package practical__10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        run();

    }

    public static void run() {
        Scanner scan = new Scanner(System.in);

        Map<Integer, String> employeeMap = new HashMap<>();


        int size = 7;

        int ID = (int) (Math.random() * 100);


        for (int i = 0; i < size; i++) {

            System.out.println("Please enter name of employee: ");


            employeeMap.put(ID, scan.nextLine());


            ID++;
        }

        //Task 1

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {

            System.out.println(entry.getKey() + " key: " + entry.getValue());
        }

        //Task 2

        System.out.println("Please enter ID: ");

        int key = scan.nextInt();

        if (employeeMap.containsKey(key)) {

            System.out.println("This key correspond element: " + employeeMap.get(key));

        } else {

            System.out.println("You enter incorrect key.");
        }

        //Task 3

        System.out.println("Please enter value: ");

        String value = scan.nextLine();
        value = scan.nextLine();

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {

            if (entry.getValue().equals(value)) {

                System.out.println("Your value corresponds key: " + entry.getKey());
            }


        }


    }

}


