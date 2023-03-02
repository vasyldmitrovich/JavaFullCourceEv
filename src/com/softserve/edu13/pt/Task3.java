package com.softserve.edu13.pt;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<String> list = Arrays.asList("Bob", "Rob", "Jack", "John", "Tom");
        list.stream().sorted().forEach(System.out::println);
    }
}
