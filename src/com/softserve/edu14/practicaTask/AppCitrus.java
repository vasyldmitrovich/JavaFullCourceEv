package com.softserve.edu14.practicaTask;

import com.softserve.edu14.ProjectFruit;
import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppCitrus {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<ProjectFruit> projectFruits = new ArrayList<>();
        projectFruits.add(new ProjectFruit("Lime", "Green"));
        projectFruits.add(new ProjectFruit("Mango", "Yellow"));
        projectFruits.add(new Citrus("Orange", "Yellow", 25.0));
        projectFruits.add(new Citrus("Grapefruit", "Red", 20.2));
        projectFruits.add(new ProjectFruit("Plum", "Red"));

        System.out.println("Yellow fruits");
        for (ProjectFruit projectFruit : projectFruits) {
            if (projectFruit.getColor().equals("Yellow")) {
                projectFruit.print();
            }
        }
/*

        Collections.sort(projectFruits, new Comparator<ProjectFruit>() {
           // @Override
            public int compare(ProjectFruit o1, ProjectFruit o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        PrintWriter writer;
        try {
            writer = new PrintWriter("projectFruits.txt");
            for (ProjectFruit projectFruit : projectFruits) {
                writer.write(projectFruit.getName() + " " + projectFruit.getColor() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("error");
*/

    }

}
