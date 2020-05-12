package com.company.BuilderPatternChallenge;

public class VegMealBuilder implements MealBuilder {
    private final Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new VegeBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Lemonade());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
