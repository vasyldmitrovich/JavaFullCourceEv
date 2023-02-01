package homework__04;

import java.util.Objects;

public class Dog {

    private String name;
    private int age;


    enum breed {
        BEAGLE("beagle"),
        BULLDOG("bulldog"),
        DOBERMAN("doberman"),
        PUG("pug"),
        POODLE("poodle");

        public String getBreed1(String string1) {
            breed breed1 = breed.valueOf(string1);
            return null;
        }

        private String string12;

        public String getBreed(String string1) {
            return this.string12 = string1;
        }

        public String getString() {

            return string12;
        }

        breed(String string) {

            this.string12 = string;
        }

        breed() {

        }
    }

    Dog() {

    }


    Dog(int age, String name, String string1) {
        this.age = age;
        this.name = name;
        breed breed1 = breed.valueOf(string1.toUpperCase());
        try {
            breed1 = breed.valueOf(string1.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Enter another breed for dog.");


        }


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);

    }


}
