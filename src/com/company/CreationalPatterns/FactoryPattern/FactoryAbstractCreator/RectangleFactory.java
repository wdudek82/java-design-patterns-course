package com.company.CreationalPatterns.FactoryPattern.FactoryAbstractCreator;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
