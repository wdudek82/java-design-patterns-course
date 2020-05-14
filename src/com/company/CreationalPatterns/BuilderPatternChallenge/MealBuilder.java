package com.company.CreationalPatterns.BuilderPatternChallenge;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
