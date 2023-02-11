package practical__06.task__02;

public class task__02 {
    public static void main(String[] args) {
        Line[] line = {new Line(new Point(24, 21), new Point(12, 43)),
                new Line(new Point(24, 55), new Point(33, 54)),
                new ColorLine("Blue")};
        for (Line a : line) {
            a.print();
        }
    }
}
