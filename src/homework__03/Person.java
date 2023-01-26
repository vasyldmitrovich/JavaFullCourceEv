package homework__03;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    private static int counter;

    public Person() {
        counter++;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        counter++;
    }

    public int getAge() {
        return 2023 - this.birthYear;
    }

    public void input(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void ChangeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public void output() {
        System.out.println("");
        if (this.firstName == null) {
            System.out.println("Information about first name is empty. First enter firstname of person.");
        } else {
            System.out.println("Firstname of person is: " + this.firstName + ".");
        }
        if (this.lastName == null) {
            System.out.println("Information about lastname is empty. First enter lastname of person.");
        } else {
            System.out.println("Lastname of person is: " + this.lastName + ".");
        }
        if (this.birthYear == 0) {
            System.out.println("Information about birthYear is empty. First enter birthYear of person");
        } else {
            System.out.println("Age of person = " + ((getAge())) + " years old.");
        }
    }

    public void getCounter() {
        System.out.println("");
        System.out.println("You created " + this.counter + " persons.");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstname() {
        System.out.println("Firstname is :" + this.firstName);
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        System.out.println("Lastname is :" + this.lastName);
        return this.lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        System.out.println("BirthYear = " + this.birthYear);
        return this.birthYear;
    }
}
