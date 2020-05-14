package com.company.CreationalPatterns.PrototypePattern;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside " + type + "::draw() method");
    }
}
