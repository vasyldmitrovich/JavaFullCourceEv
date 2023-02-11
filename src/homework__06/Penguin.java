package homework__06;

public class Penguin extends NonFlyingBird {

    public Penguin() {
    }

    public Penguin(String feathers, String name, int layEggs) {
        super(feathers, name, layEggs);
    }

    @Override
    public String toString() {

        return "Penguin{" + super.toString();
    }

    @Override
    public void fly() {
        super.fly();

    }
}
