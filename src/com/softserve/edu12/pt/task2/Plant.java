package com.softserve.edu12.pt.task2;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException{
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "tree":
                return Type.TREE;
            case "fruit":
                return Type.FRUIT;
            case "herbal":
                return Type.HERBAL;
            case "bush":
                return Type.BUSH;
            default:
                throw new TypeException("Input only type tree, fruit, herbal or bush");
        }
    }

    private Color colorStrToEnum(String color) throws ColorException{
        switch(color.toLowerCase()){
            case "blue" : return Color.BLUE;
            case "red" : return Color.RED;
            case "white" : return Color.WHITE;
            case "orange" : return Color.ORANGE;
            case "black" : return Color.BLACK;
            case "yellow" : return Color.YELLOW;
            case "green" : return Color.GREEN;
            default : throw new ColorException("Input only color blue, red, green, orange, black, yellow or white");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
