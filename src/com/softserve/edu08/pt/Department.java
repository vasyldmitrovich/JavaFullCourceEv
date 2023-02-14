package com.softserve.edu08.pt;

public class Department implements Cloneable{
    private String name;
    private Adress adress;

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    public void setAdress(String city, String street, int building) {
        this.adress.city = city;
        this.adress.street = street;
        this.adress.building = building;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department cloneDepartment = (Department) super.clone();
        cloneDepartment.setName(name);
        cloneDepartment.setAdress((Adress) cloneDepartment.adress.clone());
        return cloneDepartment;
    }

    // inner class ===============
    public class Adress implements Cloneable{
        private String city;
        private String street;
        private int building;

        public Adress(String city, String street, int building) {
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
            return "{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Adress cloneAdress = (Adress) super.clone();
            cloneAdress.setCity(city);
            cloneAdress.setStreet(street);
            cloneAdress.setBuilding(building);
            return cloneAdress;
        }
    }
}
