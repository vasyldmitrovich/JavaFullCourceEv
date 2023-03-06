package com.softserve.edu12.practical.task2;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) throws SizeException {
        this.size = intSize(size);
        this.color = color;
        this.type = type;
    }

    public Plant(int size, String color, String type) throws SizeException, ColorException, TypeException {
        this.size = intSize(size);
        this.color = stringColor(color);
        this.type = stringType(type);
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

    @Override
    public String toString() {
        return "Plant info:\nsize - " + size + "\ncolor - " + color + "\ntype - " + type + "\n";
    }

    private int intSize(int size) throws SizeException {
        if (size <= 0) {
            throw new SizeException("Impossible size");
        }
        return size;
    }

    private Color stringColor(String color) throws ColorException {
        return switch (color) {
            case "black" -> Color.BLACK;
            case "white" -> Color.WHITE;
            case "red" -> Color.RED;
            default -> throw new ColorException("No such color available");
        };
    }

    private Type stringType(String type) throws TypeException {
        return switch (type.toLowerCase()) {
            case "bike" -> Type.BIKE;
            case "car" -> Type.CAR;
            case "truck" -> Type.TRUCK;
            default -> throw new TypeException("No such type available");
        };
    }
}
