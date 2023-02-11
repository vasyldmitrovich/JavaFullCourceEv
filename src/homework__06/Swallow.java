package homework__06;

public class Swallow extends FlyingBird {


    public Swallow() {
    }

    public Swallow(String feathers, String name, int layEggs) {
        super(feathers, name, layEggs);
    }

    @Override
    public String toString() {

        return "Swallow{" + super.toString();
    }

    @Override
    public void fly() {
        super.fly();

    }
}
