package com.softserve.edu07.practicalTasks.task1;

public class Dog implements Animal{
    final String favoriteFood = "bone";

    public Dog() {
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    @Override
    public void voice() {
        System.out.println("\nWuff-wuff");
    }

    @Override
    public void feed(String food) {
        if(favoriteFood == food){
            System.out.println("This is what I wanted :)");
        } else {
            System.out.println("Thank you");
        }
    }
}
