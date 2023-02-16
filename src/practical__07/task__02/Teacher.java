package practical__07.task__02;

public class Teacher extends Staff {

    private final String TYPE_PERSON = "Teacher";

    public Teacher() {
        System.out.println("You created " + this.TYPE_PERSON + " type of person.");
    }

    public Teacher(String name) {
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

    @Override
    public void salary() {
        System.out.println("My salary as a " + this.TYPE_PERSON + " is 4000$ for month.");
    }
}
