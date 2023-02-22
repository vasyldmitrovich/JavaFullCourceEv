package com.softserve.edu09.homework;

import java.util.Collections;
import java.util.List;

public class ListExtra {
    public static void fill(List<Integer> list, int size) {
        list.clear();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 100 - 50));
        }
    }

    public static void swapMaxAndMin(List<Integer> list) {
        int indexOfMax = list.indexOf(Collections.max(list));
        int indexOfMin = list.indexOf(Collections.min(list));
        Collections.swap(list, indexOfMax, indexOfMin);
    }

    public static void insertBeforeNegative(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                int x = (int) ((Math.random()) * 899 + 100);
                list.add(i, x);
                break;
            }
        }
    }

    public static void insertZero(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) * list.get(i + 1) < 0) {
                list.add(i + 1, 0);
            }
        }
    }

    public static void splitList(List<Integer> list, int k) {
        List<Integer> list1 = list.subList(0, k);
        List<Integer> list2 = list.subList(k, list.size());
        Collections.reverse(list2);
        System.out.println("\nList1: " + list1);
        System.out.println("List2: " + list2);
    }

    public static void removeLastEven(List<Integer> list) {
        int i;
        for (i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) % 2 == 0){
                list.remove(i);
                break;
            }
        }
        if(i < 0){
            System.out.println("\nThis list don't have even number...");
        } else {
            System.out.println("\nMy Collection after remove even number: " + list);
        }
    }

    public static void removeAfterMin(List<Integer> list){
        int indexOfMin = list.indexOf(Collections.min(list));
        if(indexOfMin != list.size() - 1){
            list.remove(indexOfMin + 1);
        }
    }
}
