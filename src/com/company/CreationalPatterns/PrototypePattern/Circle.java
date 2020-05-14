package com.company.CreationalPatterns.PrototypePattern;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside " + type + "::draw() method");
    }
}
