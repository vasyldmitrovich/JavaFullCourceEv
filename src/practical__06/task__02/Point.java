package practical__06.task__02;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void print(int x, int y) {
        System.out.print(" Point x coordinate = " + x + " Point y coordinates = " + y);
    }

    @Override
    public String toString() {
        return (" x = " + x + ", y = " + y);
    }

}
