package com.company.BuilderPattern;

import com.company.BuilderPatternChallenge.Meal;
import com.company.BuilderPatternChallenge.MealBuilder;
import com.company.BuilderPatternChallenge.NonVegMealBuilder;
import com.company.BuilderPatternChallenge.VegMealBuilder;

public class Demo {
    public static void run() {
        Builder carBuilder = new Car();
        Builder motorcycleBuilder = new Motorcycle();

        Director director = new Director();

        director.construct(carBuilder);
        Product car = carBuilder.getVehicle();
        car.show();

        director.construct(motorcycleBuilder);
        Product motorcycle = motorcycleBuilder.getVehicle();
        motorcycle.show();
    }

    public static void runChallenge() {
        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder chickenMealBuilder = new NonVegMealBuilder();

        com.company.BuilderPatternChallenge.Director director = new com.company.BuilderPatternChallenge.Director();

        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        vegMeal.showItems();

        director.construct(chickenMealBuilder);
        Meal chickenMeal = chickenMealBuilder.getMeal();
        chickenMeal.showItems();
    }
}
