package com.softserve.edu04.practicalTask;

import java.util.*;

public class AppProduct {

    public static void main(String[] args) {

        Product pr0 = new Product("Blue jeans",  50, 6);
        Product pr1 = new Product("Black jeans",  45, 7);
        Product pr2 = new Product("Skinny jeans",  73, 4);
        Product pr3 = new Product("Wide bottom jeans",  65, 3);

        int [] arr = {pr0.getPrice(), pr1.getPrice(), pr2.getPrice(), pr3.getPrice()};
        int max = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }

        if (max==pr3.getPrice())
        System.out.println("The most expensive item - " + pr3.getFieldsName() +" "+ "    in  quantity  " + pr3.getQuantity());

        else if (max==pr2.getPrice())
            System.out.println("The most expensive item " + pr2.getFieldsName() +" "+ "in  quantity " + pr2.getQuantity());
        else if(max==pr1.getPrice())
        System.out.println("The most expensive item " + pr1.getFieldsName() +" "+ "in  quantity " + pr1.getQuantity());

        else if(max==pr0.getPrice())
            System.out.println("The most expensive item " + pr0.getFieldsName() +" "+ "in  quantity " + pr0.getQuantity());

        int [] app = {pr0.getQuantity(), pr1.getQuantity(), pr2.getQuantity(), pr3.getQuantity()};
        int Qmax = app[0];
        int j = 0;
        while (j < app.length) {
            if (app[j] > Qmax) {
                Qmax = app[j];
            }
            j++;
        }

        if (Qmax==pr3.getQuantity())
            System.out.println("Items, which has the biggest quantity is - " + pr3.getFieldsName());

        else if (Qmax==pr2.getQuantity())
            System.out.println("The most expensive item " + pr2.getFieldsName());
        else if(Qmax==pr1.getQuantity())
            System.out.println("The most expensive item " + pr1.getFieldsName());

        else if(Qmax==pr0.getQuantity())
            System.out.println("The most expensive item " + pr0.getFieldsName());


    }

}

