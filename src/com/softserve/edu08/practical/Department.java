package com.softserve.edu08.practical;

public class Department implements Cloneable {

    private String name;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department name: " + getName() + "\nAddress: " + getAddress();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department cloned = (Department) super.clone();
        cloned.setAddress((Address) cloned.address.clone());
        return cloned;
    }


    static class Address implements Cloneable {
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
            return "\nCity -> " + getCity() + "\nStreet -> " + getStreet() + "\nBuilding -> " + getBuilding() + "\n";
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Address cloned = (Address) super.clone();
            cloned.setCity(Application.userInput());
            return cloned;
        }
    }
}
