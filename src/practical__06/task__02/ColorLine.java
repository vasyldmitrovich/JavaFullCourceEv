package practical__06.task__02;

public class ColorLine extends Line {

    private String color;

    public ColorLine() {
    }

    public ColorLine(String color) {
        this.color = color;
    }

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Object print() {
        System.out.println("Color of lines is " + color);
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + ("Color = " + color);
    }
}
