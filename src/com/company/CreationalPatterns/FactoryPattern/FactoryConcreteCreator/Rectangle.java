package com.company.CreationalPatterns.FactoryPattern.FactoryConcreteCreator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
