package com.company.AbstractFactoryPattern;

import com.company.AbstractFactoryPattern.ProductFamilies.Color;
import com.company.AbstractFactoryPattern.ProductFamilies.ColorType;
import com.company.AbstractFactoryPattern.ProductFamilies.Shape;
import com.company.AbstractFactoryPattern.ProductFamilies.ShapeType;

public class Demo {
    public static void run() {
        AbstractFactory<Shape, ShapeType> shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
        AbstractFactory<Color, ColorType> colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);

        shapeFactory.getItem(ShapeType.CIRCLE).draw();
        shapeFactory.getItem(ShapeType.RECTANGLE).draw();
        shapeFactory.getItem(ShapeType.SQUARE).draw();

        colorFactory.getItem(ColorType.RED).fill();
        colorFactory.getItem(ColorType.GREEN).fill();
        colorFactory.getItem(ColorType.BLUE).fill();
    }
}
