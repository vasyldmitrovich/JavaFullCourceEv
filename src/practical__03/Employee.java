package practical__03;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public int getSalary() {
        if (this.rate == 0 || this.hours == 0) {
            System.out.println("Please, first enter all information about hours and rate of employee to calculate salary.");

        } else {
            int salary = this.rate * this.hours;
            this.totalSum += salary;
            return salary;
        }
        return 0;
    }

    public static int getTotalSum() {
        System.out.println("");
        if (totalSum == 0) {
            System.out.println("First you need to enter information about your salary(hours and rate of employee)");
        }
        System.out.println("Total salary of all workers = " + totalSum + "$.");

        return 0;
    }

    public int getBonuses() {
        if (this.hours == 0 || this.rate == 0) {
            System.out.println("Please, first enter information about rate of employee and hours of employee to calculate bonus.");
        } else {
            int bonuses = (rate * hours) * 10 / 100;
            return bonuses;
        }
        return 0;
    }

    @Override
    public String toString() {
        System.out.println("");
        if (this.name == null) {
            System.out.println("Information about name is empty.");
        } else {
            System.out.println("Name of employee: " + this.name + ".");
        }
        System.out.println("Salary of employee = " + (getSalary()) + "$.");
        System.out.println("Bonus to salary = " + (getBonuses()) + "$.");
        if (this.rate == 0) {
            System.out.println("Information about rate is empty.");
        } else {
            System.out.println("Rate of employee = " + this.rate + "*.");
        }
        if (this.rate == 0) {
            System.out.println("Information about hours is empty.");
        } else {
            System.out.println("Working hours of employee = " + this.hours + ".");
        }

        return null;
    }


    public Employee() {

    }

    public Employee(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        if (this.name == null) {
            System.out.println("Information about name of employee is empty");
        } else {
            System.out.println("Name of employee: " + this.name);
        }
        return this.name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {

        if (this.hours == 0) {
            System.out.println("Information about rate of employee is empty.");
        } else
            System.out.println("Rate of employee = " + this.rate + "*");
        return this.rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        if (this.hours == 0) {
            System.out.println("Information about hours of employee is empty.");
        } else
            System.out.println("Hours of employee = " + this.hours);
        return this.hours;
    }
}
