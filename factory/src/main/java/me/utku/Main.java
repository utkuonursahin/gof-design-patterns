package me.utku;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.circle();
        Shape square = shapeFactory.square();

        circle.draw();
        square.draw();
    }
}