package com.softserve.edu14.hw.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(Category.PHONE, new Date(2022-1900,1,1), 3700));
        list.add(new Product(Category.TV, new Date(2022-1900,1,1) , 800));
        list.add(new Product(Category.FRIDGE, new Date(2021-1900,1,1) , 900));
        list.add(new Product(Category.MIXER, new Date(2018-1900,1,1) , 750));
        list.add(new Product(Category.PC, new Date(2019-1900,1,1) , 820));
        list.add(new Product(Category.PHONE, new Date(2021-1900,1,1) , 2930));
        list.add(new Product(Category.PHONE, new Date(2017-1900,1,1) , 4740));
        list.add(new Product(Category.FRIDGE, new Date(2020-1900,1,1) , 650));
        list.add(new Product(Category.PC, new Date(2021-1900,1,1) , 1100));
        list.add(new Product(Category.TV, new Date(2023-1900,1,1) , 990));
        list.add(new Product(Category.PC, new Date(2016-1900,1,1) , 1190));
        list.add(new Product(Category.MIXER, new Date(2019-1900,1,1) , 200));
        list.add(new Product(Category.PHONE, new Date(2023-1900,1,1) , 5200));
        list.add(new Product(Category.FRIDGE, new Date(2022-1900,1,1) , 500));
        list.add(new Product(Category.PHONE, new Date(2021-1900,1,1) , 1970));
        list.add(new Product(Category.TV, new Date(2018-1900,1,1) , 710));
        list.add(new Product(Category.PC, new Date(2020-1900,1,1) , 490));
        list.add(new Product(Category.PHONE, new Date(2022-1900,1,1) , 3720));
        list.add(new Product(Category.MIXER, new Date(2023-1900,1,1) , 130));
        list.add(new Product(Category.PHONE, new Date(2018-1900,1,1) , 2800));

        System.out.println(sort(list));
    }

    public static List<Product> sort(List<Product> list){
        return list.stream().filter(x -> x.getCategory() == Category.PHONE)
                            .filter(x -> x.getPrice() > 3000)
                            .filter(x -> x.getDate().getTime() < new Date(System.currentTimeMillis()).getTime() - 365L *24*60*60*1000)
                            .collect(Collectors.toList());
    }
}
