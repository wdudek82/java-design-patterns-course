package com.company.CreationalPatterns.FactoryPattern.FactoryAbstractCreator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
