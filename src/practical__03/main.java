package practical__03;

public class main {
    public static void main(String[] args) {
        Employee firstworker = new Employee("Ivan");
        Employee secondworker = new Employee(10, 45);
        Employee thirdworker = new Employee();
        firstworker.setHours(40);
        firstworker.setRate(5);
        firstworker.toString();
        secondworker.setName("Peter");
        secondworker.toString();
        thirdworker.setRate(5);
        thirdworker.setHours(50);
        thirdworker.setName("John");
        thirdworker.toString();
        thirdworker.getTotalSum();
    }
}
