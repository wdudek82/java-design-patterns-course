package com.company.CreationalPatterns.FactoryConcreteCreator;

public class Client {
    public static void run() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeType.TRIANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape3.draw();
    }
}
