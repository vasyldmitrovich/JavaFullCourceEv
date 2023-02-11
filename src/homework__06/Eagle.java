package homework__06;

public class Eagle extends FlyingBird {

    public Eagle() {
    }

    public Eagle(String feathers, String name, int layEggs) {
        super(feathers, name, layEggs);
    }

    @Override
    public String toString() {

        return "Eagle{" + super.toString();
    }

    @Override
    public void fly() {
        super.fly();

    }
}
