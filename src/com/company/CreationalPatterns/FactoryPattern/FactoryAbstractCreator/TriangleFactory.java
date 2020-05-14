package com.company.CreationalPatterns.FactoryPattern.FactoryAbstractCreator;

public class TriangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Triangle();
    }
}
