package com.company.CreationalPatterns.BuilderPattern;

import com.company.CreationalPatterns.BuilderPatternChallenge.Meal;
import com.company.CreationalPatterns.BuilderPatternChallenge.MealBuilder;
import com.company.CreationalPatterns.BuilderPatternChallenge.NonVegMealBuilder;
import com.company.CreationalPatterns.BuilderPatternChallenge.VegMealBuilder;

public class Demo {
    public static void run() {
        Director director = new Director();

        Builder carBuilder = new Car();
        Builder motorcycleBuilder = new Motorcycle();

        director.construct(carBuilder);
        Product car = carBuilder.getVehicle();
        car.show();

        director.construct(motorcycleBuilder);
        Product motorcycle = motorcycleBuilder.getVehicle();
        motorcycle.show();
    }

    public static void runChallenge() {
        com.company.CreationalPatterns.BuilderPatternChallenge.Director director = new com.company.CreationalPatterns.BuilderPatternChallenge.Director();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder chickenMealBuilder = new NonVegMealBuilder();

        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        vegMeal.showItems();

        director.construct(chickenMealBuilder);
        Meal chickenMeal = chickenMealBuilder.getMeal();
        chickenMeal.showItems();
    }
}
