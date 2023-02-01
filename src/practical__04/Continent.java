package practical__04;

public class Continent {

    public static Continent Europe = new Continent("Europe");
    public static Continent America = new Continent("America");
    public static Continent Asia = new Continent("Asia");
    private String continent;

    private Continent(String continent) {
        this.continent = continent;

    }

    @Override
    public String toString() {
        System.out.println(this.continent);
        return continent;
    }
}

