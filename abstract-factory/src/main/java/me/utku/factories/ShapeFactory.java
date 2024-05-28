package me.utku.factories;

import me.utku.shapes.Circle;
import me.utku.shapes.Rectangle;
import me.utku.shapes.Shape;
import me.utku.shapes.Square;

public class ShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else return null;
    }
}
