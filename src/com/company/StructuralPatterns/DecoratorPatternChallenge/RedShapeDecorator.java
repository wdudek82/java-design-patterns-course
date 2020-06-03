package com.company.StructuralPatterns.DecoratorPatternChallenge;

public class RedShapeDecorator extends ShapeDecorator {
    @Override
    public void draw() {
        super.draw();
        System.out.println("And fills it with red color.");
    }
}
