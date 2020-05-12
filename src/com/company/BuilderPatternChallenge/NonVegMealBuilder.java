package com.company.BuilderPatternChallenge;

public class NonVegMealBuilder implements MealBuilder {
    private final Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Cola());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
