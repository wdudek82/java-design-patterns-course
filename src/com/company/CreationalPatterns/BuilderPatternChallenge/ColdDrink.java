package com.company.CreationalPatterns.BuilderPatternChallenge;

public abstract class ColdDrink implements Item {
    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
