package com.company.StructuralPatterns.DecoratorPatternChallenge;

public abstract class ShapeDecorator extends Shape {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        if (shape != null) {
            shape.draw();
        }
    }
}
