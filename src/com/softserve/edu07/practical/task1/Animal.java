package com.softserve.edu07.practical.task1;

public interface Animal {
    void voice ();
    default void feed () {
        System.out.println("I'm going to eat!\n");
    }

}
