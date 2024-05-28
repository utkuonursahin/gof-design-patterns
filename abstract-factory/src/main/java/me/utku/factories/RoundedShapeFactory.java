package me.utku.factories;

import me.utku.shapes.RoundedRectangle;
import me.utku.shapes.RoundedSquare;
import me.utku.shapes.Shape;

public class RoundedShapeFactory implements AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
