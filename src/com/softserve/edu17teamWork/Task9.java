package com.softserve.edu17teamWork;

import java.util.ArrayList;;
import java.util.List;

public class Task9 {
    public static void run(int n){
        if(n == 0){
            System.out.println("Too small n :)");
        } else {
            List<Integer> list = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                list.add(getZeroOrOne());
            }

            System.out.println("Number of zeros: " + list.stream().filter(x -> x == 0).count());
            System.out.println("Number of units: " + list.stream().filter(x -> x == 1).count());
        }
    }

    public static int getZeroOrOne(){
        return (int)(Math.random() * 2);
    }
}
