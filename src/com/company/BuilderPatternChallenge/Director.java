package com.company.BuilderPatternChallenge;

public class Director {
    MealBuilder myMealBuilder;

    public void construct(MealBuilder mealBuilder) {
        myMealBuilder = mealBuilder;
        myMealBuilder.buildBurger();
        myMealBuilder.buildDrink();
    }
}
