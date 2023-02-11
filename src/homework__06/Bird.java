package homework__06;

public abstract class Bird {

    private String feathers;
    private int layEggs;

    private String name;

    protected Bird() {
    }

    public Bird(String feathers, String name, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.name = name;
    }


    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void fly();

    @Override
    public String toString() {
        return "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
