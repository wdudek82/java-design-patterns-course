package com.company.CreationalPatterns.FactoryPattern.FactoryStaticCreator;

import com.company.CreationalPatterns.FactoryConcreteCreator.Circle;
import com.company.CreationalPatterns.FactoryConcreteCreator.Rectangle;
import com.company.CreationalPatterns.FactoryConcreteCreator.Shape;
import com.company.CreationalPatterns.FactoryConcreteCreator.Triangle;

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
