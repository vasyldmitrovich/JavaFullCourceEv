package homework__07;

public class SalariedEmployee extends Employee implements Payment {

    private int rate;

    private int workHours;

    private int socialSecurityNumber;

    private String name;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String employeeld, int rate, int workHours, int socialSecurityNumber, String name) {
        super(employeeld);
        this.rate = rate;
        this.workHours = workHours;
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
    }

    @Override
    public int calculatePay() {

        int salary = workHours * rate;
        return salary;
    }

    @Override
    public void print() {
        System.out.println("My name is " + this.name + " and I am a " + this.employeeld +
                "\nMy ID is " + this.socialSecurityNumber + "\nMy monthly salary is " + calculatePay() + "$");
        System.out.println("");
    }
}
