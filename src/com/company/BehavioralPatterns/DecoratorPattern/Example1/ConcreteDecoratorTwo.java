package com.company.BehavioralPatterns.DecoratorPattern.Example1;

public class ConcreteDecoratorTwo extends ConcreteDecoratorOne {
    @Override
    public void doJob() {
        System.out.println("");
        System.out.println("*** START Ex-2 ***");

        super.doJob();

        // add additional responsibilities
        System.out.println("I am explicitly form Ex-2");
    }
}
