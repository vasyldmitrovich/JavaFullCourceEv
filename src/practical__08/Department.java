package practical__08;

public class Department implements Cloneable {

    public static class Address implements Cloneable {

        private String city;

        private String street;

        private int building;

        public Address() {
        }

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }

    private String name;

    protected Address address;

    public Department() {

        address = new Address();
    }

    public Department(String name, String street, String city, int building) {
        address = new Address();
        this.name = name;
        address.street = street;
        address.city = city;
        address.building = building;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " . " + address;
    }
}
