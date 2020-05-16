package com.company.BehavioralPatterns.AdapterPattern.Example2;

public class Calculator implements CalculatorInterface {
    Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}
