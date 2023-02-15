package com.softserve.edu08.practicalTask;

public class Department implements Cloneable{
    private String name;
    private Address address;

    public Department() {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddress(String city, String street, int building) {
        this.address.city = city;
        this.address.street = street;
        this.address.building = building;
    }

    @Override
    public String toString() {
        return "\nName: " + name + getAddress();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Department cloneOfDepartment = (Department)super.clone();
        cloneOfDepartment.setName(name);
        cloneOfDepartment.setAddress((Address)cloneOfDepartment.address.clone());
        return cloneOfDepartment;
    }

    public class Address implements Cloneable{
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
            return "\nCity: " + city
                    + "\nStreet: " + street
                    + "\nBuilding: " + building;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException{
            Address cloneOfAddress = (Address) super.clone();
            cloneOfAddress.setCity(city);
            cloneOfAddress.setStreet(street);
            cloneOfAddress.setBuilding(building);
            return cloneOfAddress;
        }
    }
}
