package practical__09;

import java.util.*;

public class main {
    public static void main(String[] args) {

        run();

    }

    public static void run() {

        Scanner scan = new Scanner(System.in);

        List<Integer> myCollection = new LinkedList<>();

        int a = 0;

        while (a < 10) {
            System.out.println("Please enter " + (a + 1) + " element of collection.");
            myCollection.add(scan.nextInt());
            a++;
        }
        System.out.println(" ");
        System.out.println("You create collection: " + myCollection);

        //task 1

        List<Integer> newCollection = new LinkedList<>();

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) > 5) {

                newCollection.add(myCollection.get(i));
            }

        }
        System.out.println("New collection: " + newCollection);

        //task 2

        /* System.out.println("");
        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) > 20) {

                myCollection.remove(i);
            }
        }
        System.out.println("My collection after remove elements which are greater then 20: " + myCollection);*/

        //task 3
        System.out.println(" ");
        myCollection.set(2, 1);

        myCollection.set(8, -3);

        myCollection.set(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {

            System.out.println("Position: " + i + " [value of elements = " + myCollection.get(i) + "]");
        }

        //

        System.out.println("");
        Collections.sort(myCollection);
        System.out.println("My collection after sort: " + myCollection);
    }

}
