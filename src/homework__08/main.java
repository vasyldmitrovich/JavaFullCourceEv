package homework__08;

public class main {
    public static void main(String[] args) {

        run();

    }

    public static void run() {
        Student student = new Student(24, new FullName("Ivan", "Dmitro"), 22);
        Student student1 = new Student(55, new FullName("Peter", "Ivan"), 25);
        System.out.println(student.info());

        System.out.println(student.activity());

        System.out.println(student1.info());

        System.out.println(student1.activity());

        Student newstudent = null;
        try {
            newstudent = (Student) student.clone();
        } catch (CloneNotSupportedException e) {
        }
        System.out.println("Coppied student = " + newstudent.info());

        newstudent.setCourses(2);

        System.out.println("Chandeg = " + newstudent.info());
    }
}
