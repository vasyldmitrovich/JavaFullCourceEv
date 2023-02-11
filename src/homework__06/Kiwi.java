package homework__06;

public class Kiwi extends NonFlyingBird {


    public Kiwi() {
    }

    public Kiwi(String feathers, String name, int layEggs) {
        super(feathers, name, layEggs);
    }

    @Override
    public String toString() {

        return "Kiwi{" + super.toString();
    }

    @Override
    public void fly() {
        super.fly();

    }
}
