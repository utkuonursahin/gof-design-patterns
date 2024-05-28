package me.utku;

public class ShapeFactory {

    public Shape circle() {
        return new Circle();
    }

    public Shape square() {
        return new Square();
    }
}
