package com.company.CreationalPatterns.AbstractFactoryPattern.ProductFamilies;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn new shape: a square.");
    }
}
