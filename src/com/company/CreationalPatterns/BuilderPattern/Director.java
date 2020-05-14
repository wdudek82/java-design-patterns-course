package com.company.CreationalPatterns.BuilderPattern;

public class Director {
    Builder myBuilder;

    public void construct(Builder builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
