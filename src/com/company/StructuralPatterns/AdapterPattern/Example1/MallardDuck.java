package com.company.StructuralPatterns.AdapterPattern.Example1;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
