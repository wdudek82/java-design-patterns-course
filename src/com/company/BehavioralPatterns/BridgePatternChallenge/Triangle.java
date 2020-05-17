package com.company.BehavioralPatterns.BridgePatternChallenge;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    // Implementer-specific method
    @Override
    public void drawShape(int border) {
        System.out.println("\nThis Triangle is colored with: ");
        color.fillWithColor(border);
    }
}
