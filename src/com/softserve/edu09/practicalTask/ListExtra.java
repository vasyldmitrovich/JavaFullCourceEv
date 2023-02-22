package com.softserve.edu09.practicalTask;

import java.util.List;

public class ListExtra {
    public static void fill(List<Integer> list, int size){
        list.clear();
        for(int i = 0; i < size; i++){
            list.add((int)(Math.random() * 100 - 50));
        }
    }

    public static void deleteMoreThan(List<Integer> list, int number){
        for(int i = 0; i < list.size(); i++){
            if(number < (int)list.get(i)){
                list.remove(i);
                i--;
            }
        }
    }

    public static void input(List<Integer> list){
        System.out.println();
        for(int i = 0; i < list.size(); i++){
            System.out.println("position: " + i + ", value: " + list.get(i));
        }
    }
}
