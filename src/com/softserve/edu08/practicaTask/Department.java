package com.softserve.edu08.practicaTask;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String city, String street, int building) {
        this.address.city = city;
        this.address.street = street;
        this.address.building = building;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department cloneDepartment = (Department) super.clone();
        cloneDepartment.setName(name);
        cloneDepartment.setAddress((Address) cloneDepartment.address.clone());
        return cloneDepartment;
    }

    public class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

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

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Address clonedAddress = (Address) super.clone();
            clonedAddress.setCity(city);
            clonedAddress.setStreet(street);
            clonedAddress.setBuilding(building);
            return clonedAddress;
        }
    }
}
