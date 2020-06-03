package com.company.StructuralPatterns.AdapterPattern.Example1;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance.");
    }
}
