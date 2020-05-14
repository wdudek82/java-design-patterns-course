package com.company.CreationalPatterns.FactoryPattern.FactoryAbstractCreator;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }

    // other helper methods
}
