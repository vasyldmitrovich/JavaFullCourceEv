package com.softserve.edu09.hw;

import java.util.Collections;
import java.util.List;

public class Solve {
    public static List toFill(List list){
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 70 - 35));
//            list.add(1);
        }
        return list;
    }

    public static List swapMaxMin(List list){
        int max = (int) list.get(0), min = (int) list.get(0);
        int indexOfMax = 0, indexOfMin = 0;
        for (int i = 0; i < list.size(); i++) {
            if(max < (int)list.get(i)){
                max = (int)list.get(i);
                indexOfMax = i;
            } else if(min > (int)list.get(i)){
                min = (int)list.get(i);
                indexOfMin = i;
            }
        }
        list.set(indexOfMax, min);
        list.set(indexOfMin, max);
        return list;
    }

    public static List insertRandomNumber(List list){
        int x = (int)(Math.random()*1999.9) - 1000;
        for (int i = 0; i < list.size(); i++) {
            if((int)list.get(i) < 0){
                list.add(i, x);
                break;
            }
        }
        return list;
    }

    public static List insertZero(List list){
        for (int i = 1; i < list.size(); i++) {
            if((int)list.get(i-1) > 0 && (int)list.get(i) < 0){
                list.add(i, 0);
            } else if((int)list.get(i-1) < 0 && (int)list.get(i) > 0){
                list.add(i, 0);
            }
        }
        return list;
    }

    public static void twoLists(List list, int k){
        List list1 = list.subList(0, k);
        List list2 = list.subList(k, list.size());
        Collections.reverse(list2);
        System.out.println(list1 + " = list1");
        System.out.println(list2 + " = list2");
    }

    public static List removeEven(List list){
        boolean bool = false;
        for (int i = list.size() - 1; i >= 0; i--) {
            if((int)list.get(i)%2 == 0){
                list.remove(i);
                bool = true;
                break;
            }
        }
        if(!bool){
            System.out.println("there are no even elements in the list");
        }
        return list;
    }

    public static List removeAfterMin(List list) {
        int min = (int) list.get(0);
        int indexOfMin = 0;
        for (int i = 0; i < list.size(); i++) {
            if (min > (int) list.get(i)) {
                min = (int) list.get(i);
                indexOfMin = i;
            }
        }
        if(indexOfMin != list.size() - 1){
            list.remove(indexOfMin+1);
        }
        return list;
    }
}
