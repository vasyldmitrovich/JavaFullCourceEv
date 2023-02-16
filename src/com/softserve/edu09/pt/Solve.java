package com.softserve.edu09.pt;

import java.util.List;

public class Solve {

    //fills the collection with random numbers
    public List toFill(List list){
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 70 - 35));
        }
        return list;
    }

    public void onScreen(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("position[" + i +"], value of element = " + list.get(i));
        }
    }

    public List removeGreaterThen20(List list){
        for (int i = 0; i < list.size(); i++) {
            if ((int)list.get(i) > 20) {
                list.remove(i--);
            }
        }
        return list;
    }
}
