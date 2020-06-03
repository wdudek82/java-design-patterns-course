package com.company.BehavioralPatterns.TemplatePattern;

public class WoodenHouse extends HouseTemplate {
    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with Wood coating.");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building Wooden Walls.");
    }
}
