package com.neevor.FactoryStaticCreator;

import com.neevor.FactoryConcreteCreator.Shape;

public class Client {
    public static void run() {
        Shape shape1 = ShapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape(ShapeType.TRIANGLE);
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape(ShapeType.RECTANGLE);
        shape3.draw();
    }
}
