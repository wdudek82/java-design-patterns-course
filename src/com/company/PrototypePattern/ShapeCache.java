package com.company.PrototypePattern;

import java.util.Hashtable;

public class ShapeCache {
    private static final Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);

        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Shape circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Shape square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Shape rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
