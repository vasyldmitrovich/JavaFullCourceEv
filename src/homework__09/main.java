package homework__09;

import java.util.*;
import java.util.Collections;
import java.util.List;

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

        int max = myCollection.get(0);

        int maxInd = 0;

        int min = myCollection.get(0);

        int minInd = 0;

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) > max) {

                max = myCollection.get(i);

                maxInd = i;
            }

            if (myCollection.get(i) < min) {

                min = myCollection.get(i);

                minInd = i;
            }


        }


        myCollection.set(minInd, max);

        myCollection.set(maxInd, min);

        System.out.println("My collection(task 1) : " + myCollection);


        //task 2
        int b = (int) (Math.random() * 100);
        int count = 0;
        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) < 0 && count == 0) {
                myCollection.add(i, b);
                break;
            }

        }
        System.out.println("My collection(task 2): " + myCollection);

        //task 3

        for (int i = 1; i < myCollection.size(); i++) {

            if (myCollection.get(i - 1) < 0 && myCollection.get(i) > 0) {
                myCollection.add(i, 0);
            } else if (myCollection.get(i - 1) > 0 && myCollection.get(i) < 0) {
                myCollection.add(i, 0);
            }
        }

        System.out.println("My collection(task 3): " + myCollection);


        //task 4
        int k = myCollection.size() - 5;

        List<Integer> list1 = myCollection.subList(0, k);

        System.out.println("List 1(task 4) = " + list1);

        List<Integer> list2 = myCollection.subList(k, myCollection.size());

        Collections.reverse(list2);

        System.out.println("List 2(task 4) = " + list2);

        Collections.reverse(list2);
        //task 5
        int evenNumber = myCollection.get(0);

        int indxEven = 0;

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) % 2 == 0) {

                evenNumber = myCollection.get(i);
                indxEven = i;
            }

        }
        myCollection.remove(indxEven);

        System.out.println("My collection(task 5) = " + myCollection);
        //task 6

        int minTask = myCollection.get(0);

        int minIndx = 0;

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) < minTask) {
                minTask = myCollection.get(i);
                minIndx = i;
            }
        }
        if (minIndx != myCollection.size() - 1) {

            myCollection.remove(minIndx + 1);
        }

        System.out.println("My collection(task 6) = " + myCollection);

    }
}