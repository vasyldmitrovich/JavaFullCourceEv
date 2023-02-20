package homework__08;

import homework__08.FullName;

public abstract class Person {

    private int age;

    private FullName fullName;

    public Person(int age, FullName fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public String info() {

        return "First name = " + fullName.getFirstName() + ". Last name = " + fullName.getLastName() + ". Age = " + age + ". ";
    }

    public abstract String activity();
}
