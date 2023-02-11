package practical__06;

public class task__01 {
    public static void main(String[] args) {

        Car[] car = {new Truck("Kamaz", 55, 10, true),
                new Truck("Tesla", 60, 25, true),
                new Sedan("Audi", 100, 3, false),
                new Sedan("BMW", 80, 8, false)};

        for (Car a : car) {
            if (a.ismoved == true) {
                a.run();
            } else {
                a.stop();
            }
            System.out.println(a);
            System.out.println("");
        }
    }
}



