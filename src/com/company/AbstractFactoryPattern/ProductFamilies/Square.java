package com.company.AbstractFactoryPattern.ProductFamilies;

import com.company.AbstractFactoryPattern.ProductFamilies.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn new shape: a square.");
    }
}
