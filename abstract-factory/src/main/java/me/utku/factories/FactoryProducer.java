package me.utku.factories;

public class FactoryProducer {

    public static AbstractFactory shapeFactory(){
        return new ShapeFactory();
    }

    public static AbstractFactory roundedShapeFactory(){
        return new RoundedShapeFactory();
    }
}
