package com.neevor.FactoryStaticCreator;

import com.neevor.FactoryConcreteCreator.Circle;
import com.neevor.FactoryConcreteCreator.Rectangle;
import com.neevor.FactoryConcreteCreator.Shape;
import com.neevor.FactoryConcreteCreator.Triangle;

enum ShapeType {
    CIRCLE,
    RECTANGLE,
    TRIANGLE,
}


public class ShapeFactory {

    public static Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case TRIANGLE -> new Triangle();
        };
    }
}
