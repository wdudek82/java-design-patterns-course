package com.company.StructuralPatterns.BridgePatternChallenge;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    // Implementer-specific method
    @Override
    public void drawShape(int border) {
        System.out.println("\nThis Rectangle is colored with: ");
        color.fillWithColor(border);
    }
}
