package com.softserve.edu03.Lesson3_Files.student;

public class AppStud {

    public static void main(String[] args) {
        com.softserve.edu03.Lesson3_Files.student.Student st0 = new com.softserve.edu03.Lesson3_Files.student.Student(1,"Ivan");
        com.softserve.edu03.Lesson3_Files.student.Student st1 = new com.softserve.edu03.Lesson3_Files.student.Student(3,"Petro");
        com.softserve.edu03.Lesson3_Files.student.Student st2 = new com.softserve.edu03.Lesson3_Files.student.Student(10,"Ira");
        com.softserve.edu03.Lesson3_Files.student.Student st3 = new com.softserve.edu03.Lesson3_Files.student.Student(10,"Stepan");
        com.softserve.edu03.Lesson3_Files.student.Student st4 = new com.softserve.edu03.Lesson3_Files.student.Student();
        st4.setId(12);
        st4.setName("Oksana");
        //
        System.out.println("st4 = " + st4);
        //
        System.out.println("Students count = " + Student.getCount());
//        System.out.println("Students count = " + st4.getCount());

        String myS = "Home";
        for (int i =0; i < 5; i++) {
            System.out.println("i = " + i + " myS= " + myS);
        }
        System.out.println("i = " + "myS= " + myS);;
    }
}
