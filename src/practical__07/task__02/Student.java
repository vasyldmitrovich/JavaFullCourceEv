package practical__07.task__02;

public class Student extends Person {

    private final String TYPE_PERSON = "Student";

    public Student() {
        System.out.println("You created " + this.TYPE_PERSON + " type of person.");
    }

    public Student(String name) {
        super(name);
        System.out.println("You created " + this.TYPE_PERSON + " type of person.");
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am a " + this.TYPE_PERSON + " and my name is " + this.name);
    }
}
