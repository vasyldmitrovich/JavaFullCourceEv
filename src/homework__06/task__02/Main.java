package homework__06.task__02;

public class Main {
    public static void main(String[] args) {

        Employee arr[] = new Employee[]{
                new Employee("Roma", 25, 3000),
                new Developer("Peter", 27, 3200.42, "Java developer"),
                new Employee("Vlad", 22, 2150.24),
                new Developer("Ivan", 21, 4000.25, "Frontend developer"),
                new Employee("Vitalyi", 33, 1200.56)};

        for (Employee a : arr) {
            System.out.println(a.report());

        }

    }
}
