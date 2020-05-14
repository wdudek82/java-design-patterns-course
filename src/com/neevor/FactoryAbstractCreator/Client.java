package com.neevor.FactoryAbstractCreator;

public class Client {
    public static void run() {
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();

        Shape shape3 = new TriangleFactory().getShape();
        shape3.draw();
    }
}
