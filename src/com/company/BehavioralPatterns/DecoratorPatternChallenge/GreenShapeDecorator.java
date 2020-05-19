package com.company.BehavioralPatterns.DecoratorPatternChallenge;

public class GreenShapeDecorator extends ShapeDecorator {
    @Override
    public void draw() {
        super.draw();
        System.out.println("And fills it with green color.");
    }
}
