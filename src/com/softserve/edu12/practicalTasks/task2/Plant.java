package com.softserve.edu12.practicalTasks.task2;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant() {
    }

    public Plant(int size, String color, String type) {
        this.size = size;

        try {
            this.color = Color.valueOf(color);
        } catch (IllegalArgumentException e){
            throw new ColorException();
        }

        try {
            this.type = Type.valueOf(type);
        } catch (IllegalArgumentException e) {
            throw new TypeException();
        }
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
        return "Type: " + getType()
                + "\nColor: " + getColor()
                + "\nSize: " + size;
    }
}
