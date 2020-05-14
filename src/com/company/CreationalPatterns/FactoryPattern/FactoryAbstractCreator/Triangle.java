package com.company.CreationalPatterns.FactoryPattern.FactoryAbstractCreator;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Triangle::draw() method");
    }
}
