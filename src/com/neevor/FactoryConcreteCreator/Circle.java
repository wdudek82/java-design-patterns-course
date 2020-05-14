package com.neevor.FactoryConcreteCreator;

import com.neevor.FactoryConcreteCreator.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
