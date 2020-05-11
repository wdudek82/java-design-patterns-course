package com.company.AbstractFactoryPattern;

public class FactoryProducer {
    static AbstractFactory getFactory(FactoryType factoryType) {
        return switch (factoryType) {
            case SHAPE -> new ShapeFactory();
            case COLOR -> new ColorFactory();
        };
    }
}
