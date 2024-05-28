package me.utku;


public abstract class Shape {
    private String type;
    private Color color;

    public Shape(String type, Color color) {
        this.type = type;
        this.color = color;
    }

    public String toString() {
        return STR."I'm a \{color.log()} \{type}";
    }
}
