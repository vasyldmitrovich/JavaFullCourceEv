package homework__04;

public class task__04 {
    public static void main(String[] args) {
        String string1;
        Dog dog = new Dog(24, "Sharik", "doberman");
        Dog dog1 = new Dog(15, "Pes", "Bulldog");
        Dog dog2 = new Dog(17, "Myhtar", "pug");
        if (dog.equals(dog1)) {
            System.out.println(dog1.getName() + " it's the same dog" + " with " + dog.getName() + ".");
        }
        if (dog.equals(dog2)) {
            System.out.println(dog2.getName() + " it's the same dog" + " with " + dog.getName() + ".");
        }
        if (dog1.equals(dog2)) {
            System.out.println(dog2.getName() + " it's the same dog" + " with " + dog1.getName() + ".");
        }
        olderDog(dog.getAge(), dog1.getAge(), dog2.getAge(), dog.getName(), dog1.getName(), dog2.getName());


    }

    public static void olderDog(int a, int b, int c, String a1, String b1, String c1) {
        if (a > b && a > c) {
            System.out.println("The oldest dog is " + a1 + "(" + Dog.breed.DOBERMAN + ")");

        } else if (b > a && b > c) {
            System.out.println("The oldest dog is " + b1 + "(" + Dog.breed.BULLDOG + ")");

        } else if (c > a && c > b) {
            System.out.println("The oldest dog is" + c1 + "(" + Dog.breed.PUG + ")");

        }

    }
}