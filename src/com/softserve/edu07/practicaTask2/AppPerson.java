package com.softserve.edu07.practicaTask2;

import java.util.ArrayList;
import java.util.List;

public class AppPerson {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        Teachers teachers0 = new Teachers("Anna Ivanivna", "teacher");
        Teachers teachers1 = new Teachers("Sergiy Bogdanovich", "teacher");
        Cleaners cleaners0 = new Cleaners("Klavdiya Petrivna", "cleaner");
        Cleaners cleaners1 = new Cleaners("Agafiya Ustumivna", "cleaner");
        Students students0 = new Students("Petrov", "student");
        Students students1 = new Students("Ivan", "student");

        List<Person> people = new ArrayList<>();
        people.add(teachers0);
        people.add(teachers1);
        people.add(cleaners0);
        people.add(cleaners1);
        people.add(students0);
        people.add(students1);

        for (Person temp : people) {
            temp.print();

            if (temp instanceof Staff) {
                System.out.print(" my salary = " + ((Staff) temp).salary());
            }
            System.out.println(" ");
        }
    }
}



