package homework__10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class task__03 {
    public static void main(String[] args) {

        run();


    }


    public static void run() {

        List<Student> stud = new ArrayList<>();
        stud.add(0, new Student("Roma", 1));
        stud.add(1, new Student("Roma", 4));
        stud.add(2, new Student("Ivan", 4));
        stud.add(3, new Student("Sofia", 3));
        stud.add(4, new Student("Mariaa", 2));

        Student list = new Student();

        //Task c
        System.out.println(" ");
        System.out.println("Print students with the same course");
        list.printStudents(stud, 4);


        //Task d
        System.out.println(" ");
        System.out.println("Compare students by name and course.");
        int d = 0;
        for (int i = 1; i < stud.size(); i++) {

            list.compareName(stud.get(d), stud.get(i));
            list.compareCourse(stud.get(d), stud.get(i));
            d++;
            System.out.println(" ");
        }
        //Task e(ordered by names)
        System.out.println(" ");
        System.out.println("Ordered by name");
        stud.sort(Comparator.comparing(Student::getName));
        for (Student a : stud) {
            System.out.println("Name: " + a.getName() + " course - " + a.getCourse());

        }

        //Task e(ordered by course)
        System.out.println(" ");
        System.out.println("Ordered by course");
        stud.sort(Comparator.comparing(Student::getCourse));
        for (Student a : stud) {
            System.out.println("Name: " + a.getName() + " course - " + a.getCourse());

        }

    }
}
