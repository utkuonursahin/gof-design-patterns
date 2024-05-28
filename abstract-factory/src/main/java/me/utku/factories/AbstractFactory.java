package me.utku.factories;

import me.utku.shapes.Shape;

public interface AbstractFactory {

    public Shape getShape(String shapeType);
}
