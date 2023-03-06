package practical__12.task_02;

public class Plant {

    private int size;

    private Color color;

    private Type type;


    public Plant() {
    }

    public Plant(int size, String color, String type) throws ColorExeption, TypeException {
        /*The best decision here is using recursion
        * please rewrite this constructor using recursion*/
        this.size = size;
        Color colorising = getColoring(color);
        Type typing = getTyping(type);
        this.color = colorising;
        this.type = typing;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    private Type getTyping(String a) throws TypeException {
        switch (a.toLowerCase()) {
            case "forest":
                return Type.FOREST;
            case "marshy":
                return Type.MARSHY;
            case "steppe":
                return Type.STEPPE;

            default:
                throw new TypeException("You entered incorrect type.");

        }

    }

    private Color getColoring(String c) throws ColorExeption {

        switch (c.toLowerCase()) {
            case "yellow":
                return Color.YELLOW;
            case "white":
                return Color.WHITE;
            case "green":
                return Color.GREEN;

            default:
                throw new ColorExeption("You entered incorrect color.");

        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
