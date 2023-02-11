package practical__06.task__02;

public class Line {
    private Point point1 = new Point();
    private Point point2 = new Point();

    public Line() {
    }

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }


    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Object print() {
        System.out.print("First line coordinates " + point1 + "\n" + "Second line coordinates " + point2 + "\n");
        return null;
    }

    @Override
    public String toString() {
        return (" First point = " + point1 + "\n" + ". Second point" + point2);
    }
}
