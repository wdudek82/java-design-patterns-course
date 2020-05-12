package com.company.BuilderPatternChallenge;

public class VegeBurger extends Burger {
    @Override
    public String getName() {
        return "Vege Burger";
    }

    @Override
    public double getPrice() {
        return 25.99;
    }
}
