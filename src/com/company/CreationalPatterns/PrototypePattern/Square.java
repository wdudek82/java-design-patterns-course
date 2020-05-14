package com.company.CreationalPatterns.PrototypePattern;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside " + type + "::draw() method");
    }
}
