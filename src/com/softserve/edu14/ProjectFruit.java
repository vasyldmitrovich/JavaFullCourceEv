package com.softserve.edu14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProjectFruit {
    private String name;
    private String color;

    public ProjectFruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public ProjectFruit(){
    }
    public void input(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter fruit name ");
        this.name = input.nextLine();
        System.out.println("Enter fruit color ");
        this.color = input.nextLine();
    }
    public void print(){
        System.out.println("fruit name  " +  this.name);
        System.out.println("fruit color  " +  this.color);
    }
    public void input(String fileName) throws IOException{
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        this.name = input.nextLine();
        this.color = input.nextLine();
        input.close();
    }
    public void print(String fileName) throws IOException{
        FileWriter fileWriter = new FileWriter( fileName);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(this.name);
        printWriter.println(this.color);
        printWriter.close();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "ProjectFruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
