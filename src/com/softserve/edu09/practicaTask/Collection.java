package com.softserve.edu09.practicaTask;

import java.util.List;

public class Collection {

    public List toItem(List list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 70 - 35));
        }
        return list;
    }

    public void positionValue(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("position[" + i + "], value of element = " + list.get(i));
        }
    }

    public List deleteMoreThan20(List list) {
        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) > 20) {
                list.remove(i--);
            }
        }
        return list;
    }
}