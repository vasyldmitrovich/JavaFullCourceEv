package homework__06;

public class FlyingBird extends Bird {

    public FlyingBird() {
    }

    public FlyingBird(String feathers, String name, int layEggs) {
        super(feathers, name, layEggs);
    }

    public String toString() {

        return super.toString();
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly!");


    }
}
