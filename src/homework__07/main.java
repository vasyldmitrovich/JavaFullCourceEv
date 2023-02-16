package homework__07;

public class main {
    public static void main(String[] args) {

        run();

    }

    public static void run() {

        Employee arr[] = new Employee[]{
                new ContactEmployee("Contact employee", 50, 56463214, "Petro"),
                new SalariedEmployee("Salaried employee", 12, 40, 54673124, "Martin"),
                new ContactEmployee("Contact employee", 65, 42156125, "Volodymyr"),
                new SalariedEmployee("Salaried employee", 15, 45, 1512633, "Danilo")
        };

        for (Employee a : arr) {
            ((Payment) a).print();
            System.out.println("");
        }
    }
}

