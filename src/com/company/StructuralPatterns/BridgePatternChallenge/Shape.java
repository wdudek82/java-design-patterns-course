package com.company.StructuralPatterns.BridgePatternChallenge;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void drawShape(int border);

    public void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border *= increment;
        drawShape(border);
    }
}
