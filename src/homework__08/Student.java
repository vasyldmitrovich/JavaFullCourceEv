package homework__08;

public class Student extends Person implements Cloneable {

    private int courses;

    public Student(int age, FullName fullName, int courses) {
        super(age, fullName);
        this.courses = courses;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }

    @Override
    public String info() {
        System.out.println(" ");
        return super.info() + "Student have done = " + courses + " courses";
    }

    @Override
    public String activity() {
        return "I am reading book";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
