package com.company.CreationalPatterns.PrototypePattern;

import com.company.CreationalPatterns.PrototypePatternChallenge.BasicCar;
import com.company.CreationalPatterns.PrototypePatternChallenge.BasicCarCache;

public class Demo {
    public static void run() {
        ShapeCache.loadCache();
        Shape clonedShape1a = ShapeCache.getShape("1");
        Shape clonedShape1b = ShapeCache.getShape("1");
        Shape clonedShape2 = ShapeCache.getShape("2");
        Shape clonedShape3 = ShapeCache.getShape("3");

        System.out.println("Type: " + clonedShape1a.getType());
        clonedShape1a.draw();

        System.out.println("clone 1A == clone 1B: " + (clonedShape1a == clonedShape1b));

        System.out.println("Type: " + clonedShape2.getType());
        clonedShape2.draw();

        System.out.println("Type: " + clonedShape3.getType());
        clonedShape3.draw();
    }

    public static void runChallenge() {
        BasicCarCache.loadCache();

        BasicCar car1 = BasicCarCache.getCar("Ford");

        System.out.println("Name: " + car1.getName());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Class name: " + car1.getClass());

        BasicCar car2 = BasicCarCache.getCar("Nano");

        System.out.println("Name: " + car2.getName());
        System.out.println("Price: " + car2.getPrice());
        System.out.println("Class name: " + car2.getClass());
    }
}
