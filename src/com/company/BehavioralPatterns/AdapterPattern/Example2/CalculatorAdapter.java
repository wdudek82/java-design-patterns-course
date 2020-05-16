package com.company.BehavioralPatterns.AdapterPattern.Example2;

public class CalculatorAdapter implements CalculatorInterface {
    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();
        Rectangle r = new Rectangle(triangle.base, triangle.height * 0.5);
        return calculator.getArea(r);
    }
}
