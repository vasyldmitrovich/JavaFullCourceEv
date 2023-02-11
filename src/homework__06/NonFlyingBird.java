package homework__06;

public class NonFlyingBird extends Bird {

    public NonFlyingBird() {
    }

    public NonFlyingBird(String feathers, String name, int layEggs) {
        super(feathers, name, layEggs);
    }

    public String toString() {

        return super.toString();
    }

    @Override
    public void fly() {
        System.out.println("This bird is not flying");

    }

}
