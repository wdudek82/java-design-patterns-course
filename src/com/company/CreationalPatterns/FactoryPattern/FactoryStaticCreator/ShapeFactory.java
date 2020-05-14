package com.company.CreationalPatterns.FactoryPattern.FactoryStaticCreator;

import com.company.CreationalPatterns.FactoryPattern.FactoryConcreteCreator.Circle;
import com.company.CreationalPatterns.FactoryPattern.FactoryConcreteCreator.Rectangle;
import com.company.CreationalPatterns.FactoryPattern.FactoryConcreteCreator.Shape;
import com.company.CreationalPatterns.FactoryPattern.FactoryConcreteCreator.Triangle;

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
