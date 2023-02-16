package practical__07.task__02;

public class Cleaner extends Staff {

    private final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
        System.out.println("You created " + this.TYPE_PERSON + " type of person.");
    }

    public Cleaner(String name) {
        super(name);
        System.out.println("You created " + this.TYPE_PERSON + " type of person.");
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void salary() {
        System.out.println("My salary as a " + this.TYPE_PERSON + " is 2000$ for month.");
    }

    @Override
    public void print() {
        System.out.println("I am a " + this.TYPE_PERSON + " and my name is " + this.name);
    }
}
