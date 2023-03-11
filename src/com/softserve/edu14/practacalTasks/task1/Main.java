package com.softserve.edu14.practacalTasks.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "",
                "second", "third", "third", "sec", "blablabla");

        outNumberOfEmpty(list);
        List<String> listWithoutEmpty = removeEmpty(list);
        joinAndConvertUppercase(listWithoutEmpty);
    }

    public static void outNumberOfEmpty(List<String> list){
        long count = list.stream().filter(string -> !string.isEmpty()).count();
        System.out.println("Number of empty strings: " + count);
    }

    public static List<String> removeEmpty(List<String> list){
        list = list.stream().filter(string1 -> !string1.isEmpty()).collect(Collectors.toList());
        System.out.println("\nList without empty strings: ");
        list.forEach(string -> System.out.print(string + " "));
        return list;
    }

    public static void joinAndConvertUppercase(List<String> list){
        String stringList = list.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("\n\nAfter joining and transferring to uppercase: \n" + stringList);
    }
}
