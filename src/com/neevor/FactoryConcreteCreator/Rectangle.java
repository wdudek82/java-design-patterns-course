package com.neevor.FactoryConcreteCreator;

import com.neevor.FactoryConcreteCreator.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
