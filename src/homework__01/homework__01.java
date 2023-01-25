package homework__01;

public class homework__01 {
    public static void main(String[] args) {

        radius(4);
    }

    static void radius(int a) {
        float pi = 3.14f;
        int radius = a * a;
        float area = pi * radius;
        System.out.println("Area of circle = " + area + " cm.");
        float perimeter = 2 * pi * a;
        System.out.println("Perimeter of circle = " + perimeter + " cm.");
    }

}
