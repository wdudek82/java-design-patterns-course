package com.company.BehavioralPatterns.AdapterPattern;

import com.company.BehavioralPatterns.AdapterPattern.Example1.*;
import com.company.BehavioralPatterns.AdapterPattern.Example2.Calculator;
import com.company.BehavioralPatterns.AdapterPattern.Example2.CalculatorAdapter;
import com.company.BehavioralPatterns.AdapterPattern.Example2.Rectangle;
import com.company.BehavioralPatterns.AdapterPattern.Example2.Triangle;

public class Demo {
    public static void run() {
        // firstExample();
        secondExample();
    }

    public static void runChallenge() {

    }

    private static void firstExample() {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        testObjMethods(mallardDuck, "Mallard Duck");
        testObjMethods(turkeyAdapter, "Turkey");
    }

    private static void testObjMethods(Duck duck, String duckName) {
        System.out.println("\n:: This is the " + duckName);
        duck.quack();
        duck.fly();
    }

    private static void secondExample() {
        Rectangle rectangle = new Rectangle(20, 10);
        Triangle triangle = new Triangle(20, 10);

        Calculator calculator = new Calculator();
        double result = calculator.getArea(rectangle);
        System.out.println("Result: " + result);

        CalculatorAdapter calculatorAdapter = new CalculatorAdapter(triangle);
        double result2 = calculatorAdapter.getArea(null);
        System.out.println("Result " + result2);
    }
}
