package com.neevor.FactoryConcreteCreator;

enum ShapeType {
    CIRCLE,
    RECTANGLE,
    TRIANGLE,
}


public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case TRIANGLE -> new Triangle();
        };
    }
}
