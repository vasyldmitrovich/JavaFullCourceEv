package practical__07.task__02;

public class main {
    public static void main(String[] args) {

        run();

    }

    public static void run() {
        Person arr[] = new Person[]{
                new Cleaner("Ivan"),
                new Student("Bodia"),
                new Teacher("Petro")
        };

        for (Person a : arr) {
            a.print();
            if (a instanceof Staff) {
                ((Staff) a).salary();
            }
            System.out.println("");
        }
    }
}
