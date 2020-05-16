package com.company.BehavioralPatterns.AdapterPattern;

public class Demo {
    public static void run() {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        testObjMethods(mallardDuck, "Mallard Duck");
        testObjMethods(turkeyAdapter, "Turkey");
    }

    public static void runChallenge() {

    }

    private static void testObjMethods(Duck duck, String duckName) {
        System.out.println("\n:: This is the " + duckName);
        duck.quack();
        duck.fly();
    }
}
