package com.company.AbstractFactoryPattern.ProductFamilies;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn new shape: a rectangle.");
    }
}
