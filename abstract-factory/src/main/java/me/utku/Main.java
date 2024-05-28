package me.utku;

import me.utku.factories.AbstractFactory;
import me.utku.factories.FactoryProducer;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.shapeFactory();
        AbstractFactory roundedShapeFactory = FactoryProducer.roundedShapeFactory();

        shapeFactory.getShape("Rectangle").draw();
        shapeFactory.getShape("Square").draw();
        shapeFactory.getShape("Circle").draw();

        roundedShapeFactory.getShape("Rectangle").draw();
        roundedShapeFactory.getShape("Square").draw();
    }
}