package com.neevor.FactoryConcreteCreator;

import com.neevor.FactoryConcreteCreator.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Triangle::draw() method");
    }
}
