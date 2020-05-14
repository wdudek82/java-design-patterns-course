package com.company.CreationalPatterns.BuilderPatternChallenge;

public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public double getPrice() {
        return 50.5;
    }
}
