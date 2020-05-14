package com.neevor.FactoryAbstractCreator;

public class TriangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Triangle();
    }
}
