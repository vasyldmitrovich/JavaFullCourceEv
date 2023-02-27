package practical__12.task_02;

public class Plant {

    private int size;

    private Color color;

    private Type type;

    enum Color {
        YELLOW, WHITE, BLUE
    }

    enum Type {
        FOREST, MARSHY, STEPPE
    }

    public Plant(int size, String yellow, Type marshy) {
    }

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;

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

    public Color colorEnum(String color) throws ColorExeption {
        switch (color.toLowerCase()) {

            case "blue":
                return this.color = Color.BLUE;
            case "yellow":
                return this.color = Color.YELLOW;
            case "white":
                return this.color = Color.WHITE;
            default:
                throw new ColorExeption("Wrong color");


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
