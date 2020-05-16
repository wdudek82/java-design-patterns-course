package com.company.BehavioralPatterns.AdapterPattern;

public class Demo {
    public static void run() {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();

        Turkey wildTurkey = new WildTurkey();
        TurkeyAdapter duckAdapter = new TurkeyAdapter(wildTurkey);

        duckAdapter.quack();
        duckAdapter.fly();
    }

    public static void runChallenge() {

    }
}
