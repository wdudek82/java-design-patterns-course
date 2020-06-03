package com.company.StructuralPatterns.DecoratorPattern.Example1;

public class ConcreteDecoratorOne extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();

        // add additional responsibilities
        System.out.println("I am explicitly from Ex-1");
    }
}
