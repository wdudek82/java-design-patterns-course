package com.company.CreationalPatterns.FactoryPattern.FactoryAbstractCreator;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
