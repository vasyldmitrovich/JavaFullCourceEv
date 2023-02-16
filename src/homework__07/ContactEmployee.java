package homework__07;

public class ContactEmployee extends Employee implements Payment {

    private int workingDayPay;

    private long federalTaxIdmember;

    private String name;

    public ContactEmployee() {
    }

    public ContactEmployee(String employeeld, int workingDayPay, int federalTaxIdmember, String name) {
        super(employeeld);
        this.workingDayPay = workingDayPay;
        this.federalTaxIdmember = federalTaxIdmember;
        this.name = name;
    }

    @Override
    public int calculatePay() {
        int salary = workingDayPay * 23;
        return salary;
    }

    @Override
    public void print() {
        System.out.println("My name is " + this.name + " and I am a " + this.employeeld +
                "\nMy ID is " + this.federalTaxIdmember + "\nMy monthly salary is " + calculatePay() + "$");
        System.out.println("");
    }
}
