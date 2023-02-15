package com.softserve.edu07.practicalTasks.task1;

public class Cat implements Animal{
    final String favoriteFood = "fish";

    public Cat() {
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    @Override
    public void voice() {
        System.out.println("\nMeow");
    }

    @Override
    public void feed(String food) {
        if(favoriteFood == food){
            System.out.println("This is what I wanted <3");
        } else {
            System.out.println("Good, but could be better...");
        }
    }
}
