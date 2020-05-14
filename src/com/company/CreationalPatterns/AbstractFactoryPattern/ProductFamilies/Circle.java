package com.company.CreationalPatterns.AbstractFactoryPattern.ProductFamilies;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn new shape: a circle.");
    }
}
